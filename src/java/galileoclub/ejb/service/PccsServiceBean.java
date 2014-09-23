/*
 * PccsServiceBean.java
 * 
 * Created on Nov 18, 2008, 2:20:06 PM
 */
package galileoclub.ejb.service;

import com4j.COM4J;
import galileoclub.ejb.dao.PccsDaoRemote;
import galileoclub.jpa.Configs;
import galileoclub.jpa.Pccs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class PccsServiceBean implements PccsServiceRemote {

    private static final Logger log = Logger.getLogger(PccsServiceBean.class.getName());
    private static final String MESSAGES = "ejbmessages";
    private static final Pattern linePattern = Pattern.compile("\\r", Pattern.DOTALL | Pattern.MULTILINE);
    @EJB
    private PccsDaoRemote pccsDaoRemote;
    @EJB
    private ConfigsServiceRemote configsServiceRemote;

    @Override
    public List<String> saveCreate(Pccs pccs, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(pccs.getPccsPcc())) {
            errorList.add(messageSource.getString("pccs_pcc_required"));
        }
        if ("".equals(pccs.getPccsDesc())) {
            errorList.add(messageSource.getString("pccs_desc_required"));
        }
        if (errorList.isEmpty()) {
            try {
                pccsDaoRemote.insert(pccs);
            } catch (Exception ex) {
                Throwable cause = ex.getCause();
                boolean duplicate = false;
                while (cause != null) {
                    if (cause.toString().contains("Duplicate entry")) {
                        errorList.add(messageSource.getString("pccs_pcc_already_registered"));
                        duplicate = true;
                    }
                    cause = cause.getCause();
                }
                if (errorList.isEmpty()) {
                    errorList.add(ex.toString());
                }
                if (!duplicate) {
                    log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
                }
            }
        }
        return errorList;
    }

    @Override
    public List<String> saveUpdate(Pccs pccs, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (pccs.getPccsId() == null || pccs.getPccsId().intValue() == 0) {
            errorList.add(messageSource.getString("pccs_id_required"));
        }
        if ("".equals(pccs.getPccsPcc())) {
            errorList.add(messageSource.getString("pccs_pcc_required"));
        }
        if ("".equals(pccs.getPccsDesc())) {
            errorList.add(messageSource.getString("pccs_desc_required"));
        }
        if (errorList.isEmpty()) {
            try {
                pccsDaoRemote.update(pccs);
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    @Override
    public List<String> saveDelete(Pccs pccs, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (pccs.getPccsId() == null || pccs.getPccsId().intValue() == 0) {
            errorList.add(messageSource.getString("pccs_id_required"));
        }
        if (errorList.isEmpty()) {
            try {
                pccsDaoRemote.delete(pccs.getPccsId());
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    private String terminalSubmit(Suta suta, String req) {
        log.log(Level.INFO, "GCLUB0001: {0}", req);
        String res = suta.terminalSubmit(req);
        int waitSecond = 0;
        int maxWaitMinutes = 5;
        while (res.equals("")) {
            try {
                TimeUnit.MINUTES.sleep(1);
                waitSecond++;
                if (waitSecond > maxWaitMinutes) {
                    log.log(Level.SEVERE, "GCLUB0001:{0}", res);
                    String message = "Terminal did not respond in " + maxWaitMinutes + " minutes";
                    throw new RuntimeException(message);
                }
                res = suta.getTerminalBuffer();
            } catch (InterruptedException ex) {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
        log.log(Level.INFO, "GCLUB0001: {0}", res);
        return res;
    }

    @TransactionAttribute(TransactionAttributeType.NEVER)
    @Override
    public void createPccs() {
        Suta suta = null;
        Map<String, String> pccMap = new HashMap<String, String>();
        try {
            log.log(Level.INFO, "GCLUB0001: Running Create Pccs at {0}", Calendar.getInstance().getTime());
            Configs configs = configsServiceRemote.getByKey(ConfigsServiceBean.SEGCOUNT_SIGNON_PASSWORD);
            if (configs == null) {
                log.severe("GCLUB0001: SignOn and Password Config not found");
                return;
            }
            String[] signOnPassword = configs.getConfigValue().split("/");
            String signOn = signOnPassword[0];
            String password = signOnPassword[1];

            configs = configsServiceRemote.getByKey(ConfigsServiceBean.SEGCOUNT_HCM);
            if (configs == null) {
                log.severe("GCLUB0001: HCM Config not found");
                return;
            }
            String hcm = (String) configs.getConfigValue();

            suta = SutaFactory.createScriptableUniversalTransAgent();
            suta.hcmName(hcm);
            suta.beginSession(Integer.MIN_VALUE);

            terminalSubmit(suta, "SON/" + signOn);
            terminalSubmit(suta, "PASSWORD? " + password);
            terminalSubmit(suta, "SA/SU");
            String res = terminalSubmit(suta, "JAJKT");
            String[] pccArray = null;
            pccArray = linePattern.split(res);
            List<String> pccList = new ArrayList<String>();
            while (pccArray != null) {
                String lastPcc = pccArray[pccArray.length - 1];
                if (lastPcc.contains(")]")) {
                    pccArray[pccArray.length - 1] = lastPcc.substring(0, lastPcc.length() - 3);
                    pccList.addAll(Arrays.asList(pccArray));
                    res = terminalSubmit(suta, "MD");
                    pccArray = linePattern.split(res);
                } else {
                    pccArray[pccArray.length - 1] = lastPcc.substring(0, lastPcc.length() - 2);
                    pccList.addAll(Arrays.asList(pccArray));
                    pccArray = null;
                }
            }
            pccList.remove(0);
            for (String pcc : pccList) {
                String pccCode = pcc.substring(39, 43).trim();
                if (pccCode.length() <= 3) {
                    pccMap.put("0" + pccCode, pcc.substring(0, 39).trim());
                } else {
                    pccMap.put(pccCode, pcc.substring(0, 39).trim());
                }
            }
            for (String pcc : pccMap.keySet()) {
                Pccs pccs = pccsDaoRemote.findByPccsPcc(pcc);
                if (pccs == null) {
                    pccs = new Pccs();
                    pccs.setPccsPcc(pcc);
                    pccs.setPccsDesc(pccMap.get(pcc));
                    pccsDaoRemote.insert(pccs);
                }
            }
        } catch (Exception ex) {
            log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
        } finally {
            if (suta != null) {
                try {
                    terminalSubmit(suta, "I");
                    terminalSubmit(suta, "SOF");
                    suta.endSession(Integer.MIN_VALUE + 1);
                    suta.dispose();
                    COM4J.cleanUp();
                    suta = null;
                } catch (Exception ex) {
                    log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
                }
            }
        }
        log.log(Level.INFO, "GCLUB0001: Finish Create Pccs at {0}", Calendar.getInstance().getTime());
    }
}
