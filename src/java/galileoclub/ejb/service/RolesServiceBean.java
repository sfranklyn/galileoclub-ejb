/*
 * RolesServiceBean.java
 *
 * Created on Nov 12, 2008, 1:40:45 PM
 */
package galileoclub.ejb.service;

import galileoclub.ejb.dao.RolesDaoRemote;
import galileoclub.jpa.Roles;
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
public class RolesServiceBean implements RolesServiceRemote {

    private static final Logger log = Logger.getLogger(RolesServiceBean.class.getName());
    private static final String MESSAGES = "ejbmessages";
    @EJB
    private RolesDaoRemote rolesDaoRemote = null;

    public List<String> saveCreate(Roles roles, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(roles.getRoleName())) {
            errorList.add(messageSource.getString("role_name_required"));
        }
        if ("".equals(roles.getRoleDesc())) {
            errorList.add(messageSource.getString("role_desc_required"));
        }
        if ("".equals(roles.getRoleMenu())) {
            errorList.add(messageSource.getString("role_menu_required"));
        }
        if (errorList.size() == 0) {
            try {
                rolesDaoRemote.insert(roles);
            } catch (Exception ex) {
                Throwable cause = ex.getCause();
                boolean duplicate = false;
                while (cause != null) {
                    if (cause.toString().contains("Duplicate entry")) {
                        errorList.add(messageSource.getString("role_name_already_registered"));
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

    public List<String> saveUpdate(Roles roles, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (roles.getRoleId() == null || roles.getRoleId().intValue() == 0) {
            errorList.add(messageSource.getString("role_id_required"));
        }
        if ("".equals(roles.getRoleName())) {
            errorList.add(messageSource.getString("role_name_required"));
        }
        if ("".equals(roles.getRoleDesc())) {
            errorList.add(messageSource.getString("role_desc_required"));
        }
        if ("".equals(roles.getRoleMenu())) {
            errorList.add(messageSource.getString("role_menu_required"));
        }
        if (errorList.size() == 0) {
            try {
                rolesDaoRemote.update(roles);
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    public List<String> saveDelete(Roles roles, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (roles.getRoleId() == null || roles.getRoleId().intValue() == 0) {
            errorList.add(messageSource.getString("role_id_required"));
        }
        if (errorList.size() == 0) {
            try {
                rolesDaoRemote.delete(roles.getRoleId());
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }
}
