/*
 * ConfigsServiceBean.java
 * 
 * Created on Nov 21, 2008, 2:53:18 PM
 */
package galileoclub.ejb.service;

import galileoclub.ejb.dao.ConfigsDaoRemote;
import galileoclub.jpa.Configs;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class ConfigsServiceBean implements ConfigsServiceRemote {

    public static final String SEGCOUNT_SIGNON_PASSWORD = "SEGCOUNT_SIGNON_PASSWORD";
    public static final String SEGCOUNT_HCM = "SEGCOUNT_HCM";
    public static final String SEGCOUNT_TIME = "SEGCOUNT_TIME";
    public static final String ADMIN_MOBILE = "ADMIN_MOBILE";
    public static final String ADMIN_MAIL = "ADMIN_MAIL";
    public static final String DEBUG_MODE = "DEBUG_MODE";
    private static final Logger log = Logger.getLogger(ConfigsServiceBean.class.getName());
    private static final String MESSAGES = "ejbmessages";
    @PersistenceContext
    private EntityManager em;
    @EJB
    private ConfigsDaoRemote configsDaoRemote;

    public Configs getByKey(String configKey) {
        Query query = em.createNamedQuery("Configs.findByConfigKey");
        query.setParameter("configKey", configKey);
        Configs configs = null;
        try {
            configs = (Configs) query.getSingleResult();
        } catch (NoResultException ex) {
        }
        return configs;
    }

    public List<String> saveCreate(Configs configs, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(configs.getConfigKey())) {
            errorList.add(messageSource.getString("config_key_required"));
        }
        if ("".equals(configs.getConfigDesc())) {
            errorList.add(messageSource.getString("config_desc_required"));
        }
        if ("".equals(configs.getConfigType())) {
            errorList.add(messageSource.getString("config_type_required"));
        }
        if ("".equals(configs.getConfigValue())) {
            errorList.add(messageSource.getString("config_value_required"));
        }
        if (errorList.size() == 0) {
            try {
                configsDaoRemote.insert(configs);
            } catch (Exception ex) {
                Throwable cause = ex.getCause();
                boolean duplicate = false;
                while (cause != null) {
                    if (cause.toString().contains("Duplicate entry")) {
                        errorList.add(messageSource.getString("config_key_already_registered"));
                        duplicate = true;
                    }
                    cause = cause.getCause();
                }
                if (errorList.size() == 0) {
                    errorList.add(ex.toString());
                }
                if (!duplicate) {
                    log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
                }
            }
        }
        return errorList;
    }

    public List<String> saveUpdate(Configs configs, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (configs.getConfigId() == null || configs.getConfigId().intValue() == 0) {
            errorList.add(messageSource.getString("config_id_required"));
        }
        if ("".equals(configs.getConfigKey())) {
            errorList.add(messageSource.getString("config_key_required"));
        }
        if ("".equals(configs.getConfigDesc())) {
            errorList.add(messageSource.getString("config_desc_required"));
        }
        if ("".equals(configs.getConfigType())) {
            errorList.add(messageSource.getString("config_type_required"));
        }
        if ("".equals(configs.getConfigValue())) {
            errorList.add(messageSource.getString("config_value_required"));
        }
        if (errorList.size() == 0) {
            try {
                configsDaoRemote.update(configs);
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    public List<String> saveDelete(Configs configs, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (configs.getConfigId() == null || configs.getConfigId().intValue() == 0) {
            errorList.add(messageSource.getString("config_id_required"));
        }
        if (errorList.size() == 0) {
            try {
                configsDaoRemote.delete(configs.getConfigId());
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }
}
