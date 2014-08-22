/*
 * UsersRolesServiceBean.java
 *
 * Created on Nov 13, 2008, 10:36:08 AM
 */
package galileoclub.ejb.service;

import galileoclub.ejb.dao.RolesDaoRemote;
import galileoclub.ejb.dao.UsersDaoRemote;
import galileoclub.ejb.dao.UsersRolesDaoRemote;
import galileoclub.jpa.Roles;
import galileoclub.jpa.Users;
import galileoclub.jpa.UsersRoles;
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
public class UsersRolesServiceBean implements UsersRolesServiceRemote {

    private static final Logger log = Logger.getLogger(UsersRolesServiceBean.class.getName());
    private static final String MESSAGES = "ejbmessages";
    @EJB
    private UsersDaoRemote usersDaoRemote = null;
    @EJB
    private RolesDaoRemote rolesDaoRemote = null;
    @EJB
    private UsersRolesDaoRemote usersRolesDaoRemote = null;

    public List<String> saveCreate(UsersRoles usersRoles, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(usersRoles.getUsers().getUserName())) {
            errorList.add(messageSource.getString("user_name_required"));
        }
        if ("".equals(usersRoles.getRoles().getRoleName())) {
            errorList.add(messageSource.getString("role_name_required"));
        }
        Users users = usersDaoRemote.selectByUserName(usersRoles.getUsers().getUserName());
        if (users == null) {
            errorList.add(messageSource.getString("user_name_not_registered"));
        }
        if (errorList.size() == 0) {
            try {
                Roles roles = rolesDaoRemote.selectByRoleName(usersRoles.getRoles().getRoleName());
                usersRoles.setUsers(users);
                usersRoles.setRoles(roles);
                usersRoles.getUsersRolesPK().setRoleId(roles.getRoleId());
                usersRoles.getUsersRolesPK().setUserId(users.getUserId());
                usersRoles.setUsersRolesDesc(users.getUserName() + " " + roles.getRoleName());
                usersRolesDaoRemote.insert(usersRoles);
            } catch (Exception ex) {
                Throwable cause = ex.getCause();
                boolean duplicate = false;
                while (cause != null) {
                    if (cause.toString().contains("javax.persistence.EntityExistsException")) {
                        errorList.add(messageSource.getString("users_roles_already_registered"));
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

    public List<String> saveDelete(UsersRoles usersRoles, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(usersRoles.getUsers().getUserName())) {
            errorList.add(messageSource.getString("user_name_required"));
        }
        if ("".equals(usersRoles.getRoles().getRoleName())) {
            errorList.add(messageSource.getString("role_name_required"));
        }
        if (errorList.size() == 0) {
            try {
                usersRolesDaoRemote.delete(usersRoles.getUsersRolesPK());
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }
}
