/*
 * UrlsRolesServiceBean.java
 * 
 * Created on Nov 13, 2008, 6:06:10 PM
 */
package galileoclub.ejb.service;

import galileoclub.ejb.dao.RolesDaoRemote;
import galileoclub.ejb.dao.UrlsRolesDaoRemote;
import galileoclub.jpa.Roles;
import galileoclub.jpa.UrlsRoles;
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
public class UrlsRolesServiceBean implements UrlsRolesServiceRemote {

    private static final Logger log = Logger.getLogger(UrlsRolesServiceBean.class.getName());
    private static final String MESSAGES = "ejbmessages";
    @EJB
    private RolesDaoRemote rolesDaoRemote;
    @EJB
    private UrlsRolesDaoRemote urlsRolesDaoRemote;

    @Override
    public List<String> saveCreate(UrlsRoles urlsRoles, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(urlsRoles.getUrlsRolesPK().getUrlRole())) {
            errorList.add(messageSource.getString("url_role_required"));
        }
        if ("".equals(urlsRoles.getRoles().getRoleName())) {
            errorList.add(messageSource.getString("role_name_required"));
        }
        if (errorList.isEmpty()) {
            try {
                Roles roles = rolesDaoRemote.selectByRoleName(urlsRoles.getRoles().getRoleName());
                urlsRoles.setRoles(roles);
                urlsRoles.getUrlsRolesPK().setRoleId(roles.getRoleId());
                urlsRolesDaoRemote.insert(urlsRoles);
            } catch (Exception ex) {
                Throwable cause = ex.getCause();
                boolean duplicate = false;
                while (cause != null) {
                    if (cause.toString().contains("Duplicate entry")) {
                        errorList.add(messageSource.getString("urls_roles_already_registered"));
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
    public List<String> saveDelete(UrlsRoles urlsRoles, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(urlsRoles.getUrlsRolesPK().getUrlRole())) {
            errorList.add(messageSource.getString("url_role_required"));
        }
        if ("".equals(urlsRoles.getRoles().getRoleName())) {
            errorList.add(messageSource.getString("role_name_required"));
        }
        if (errorList.isEmpty()) {
            try {
                urlsRolesDaoRemote.delete(urlsRoles.getUrlsRolesPK());
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }
}
