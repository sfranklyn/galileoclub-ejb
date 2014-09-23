/*
 * UsersPccsServiceBean.java
 * 
 * Created on Sep 10, 2014, 1:05:23 PM
 */
package galileoclub.ejb.service;

import galileoclub.ejb.dao.PccsDaoRemote;
import galileoclub.ejb.dao.UsersPccsDaoRemote;
import galileoclub.jpa.Pccs;
import galileoclub.jpa.UsersPccs;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class UsersPccsServiceBean implements UsersPccsServiceRemote {

    private static final Logger log = Logger.getLogger(UsersPccsServiceBean.class.getName());
    private static final String MESSAGES = "ejbmessages";
    @EJB
    private PccsDaoRemote pccsDaoRemote;
    @EJB
    private UsersPccsDaoRemote UsersPccsDaoRemote;

    @Override
    public List<String> saveCreate(UsersPccs usersPccs, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (errorList.isEmpty()) {
            try {
                Pccs pccs = pccsDaoRemote.findByPccsPcc(usersPccs.getPccs().getPccsPcc());
                usersPccs.setPccs(pccs);
                usersPccs.getUsersPccsPK().setPccsId(usersPccs.getPccs().getPccsId());
                usersPccs.getUsersPccsPK().setUserId(usersPccs.getUsers().getUserId());
                UsersPccsDaoRemote.insert(usersPccs);
            } catch (Exception ex) {
                Throwable cause = ex.getCause();
                boolean duplicate = false;
                while (cause != null) {
                    if (cause.toString().contains("javax.persistence.EntityExistsException")) {
                        errorList.add(messageSource.getString("users_pccs_already_registered"));
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
    public List<String> saveDelete(UsersPccs UsersPccs, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(UsersPccs.getUsers().getUserName())) {
            errorList.add(messageSource.getString("user_name_required"));
        }
        if ("".equals(UsersPccs.getPccs().getPccsPcc())) {
            errorList.add(messageSource.getString("pccs_pcc_required"));
        }
        if (errorList.isEmpty()) {
            try {
                UsersPccsDaoRemote.delete(UsersPccs.getUsersPccsPK());
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }
}
