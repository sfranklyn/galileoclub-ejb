/*
 * ClaimsServiceBean.java
 * 
 * Created on Dec 16, 2008, 2:48:40 PM
 */
package galileoclub.ejb.service;

import galileoclub.ejb.dao.ClaimsDaoRemote;
import galileoclub.ejb.dao.PointsDaoRemote;
import galileoclub.ejb.dao.UsersDaoRemote;
import galileoclub.jpa.Claims;
import galileoclub.jpa.Points;
import galileoclub.jpa.Users;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.joda.time.DateTime;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class ClaimsServiceBean implements ClaimsServiceRemote {

    private static final Logger log = Logger.getLogger(ClaimsServiceBean.class.getName());
    private static final String MESSAGES = "ejbmessages";
    @EJB
    private ClaimsDaoRemote claimsDaoRemote = null;
    @EJB
    private PointsDaoRemote pointsDaoRemote = null;
    @EJB
    private UsersDaoRemote usersDaoRemote = null;

    @Override
    public List<String> saveClaimReward(Claims claims, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ((claims.getClaimUserCode() == null) || "".equals(claims.getClaimUserCode())) {
            errorList.add(messageSource.getString("claim_user_code_required"));
        }
        if ("".equals(claims.getClaimDesc())) {
            errorList.add(messageSource.getString("claim_desc_required"));
        }
        if (errorList.size() == 0) {
            try {
                claimsDaoRemote.insert(claims);
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    @Override
    public List<String> saveNewClaimProcess(Claims claims, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ((claims.getClaimUserCode() == null) || "".equals(claims.getClaimUserCode())) {
            errorList.add(messageSource.getString("claim_user_code_required"));
        }
        if ("".equals(claims.getClaimDesc())) {
            errorList.add(messageSource.getString("claim_desc_required"));
        }
        if (claims.getClaimResponse() == null) {
            errorList.add(messageSource.getString("claim_response_required"));
        }
        if ("".equals(claims.getClaimResponse())) {
            errorList.add(messageSource.getString("claim_response_required"));
        }
        if (errorList.size() == 0) {
            try {
                claimsDaoRemote.update(claims);
                Users users = usersDaoRemote.selectByUserCode(claims.getClaimUserCode());
                if ("X".equals(claims.getClaimStatus())) {
                    Points points = new Points();
                    points.setClaims(claims);
                    points.setPointCount(0);
                    DateTime claimDate = new DateTime(claims.getClaimDate().getTime());
                    points.setPointYear(claimDate.getYear());
                    points.setPointMonth(claimDate.getMonthOfYear());
                    points.setPointDay(claimDate.getDayOfMonth());
                    points.setPointUserCode(claims.getClaimUserCode());
                    points.setPointPcc(users.getUserPcc());
                    points.setPointSignon(users.getUserSon());
                    pointsDaoRemote.insert(points);
                }
                if ("X".equals(claims.getClaimStatus()) || "C".equals(claims.getClaimStatus())) {
                    String body = "";
                    String subject = "";
                    body = users.getUserCode() + "\n\n";
                    if ("X".equals(claims.getClaimStatus())) {
                        subject = messageSource.getString("claim_status_notification1");
                        body = body + messageSource.getString("claim_reject_info1");
                        body = body + users.getFullName() + " ";
                        body = body + claims.getClaimResponse() + "\n\n";
                        body = body + messageSource.getString("claim_reject_info2");
                    }
                    if ("C".equals(claims.getClaimStatus())) {
                        subject = messageSource.getString("claim_status_notification2");
                        body = body + messageSource.getString("claim_confirm_info1");
                        body = body + users.getFullName() + " ";
                        body = body + claims.getClaimResponse() + "\n\n";
                        body = body + messageSource.getString("claim_confirm_info2");
                    }
                    ExecutorService es = Executors.newSingleThreadExecutor();
                    SendMail sm = new SendMail(subject,
                            body,
                            "galileoclub@galileoindonesia.com", users.getUserEmail());
                    es.submit(sm);
                    es.shutdown();
                }
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    @Override
    public List<String> saveReconfirm(Claims claims, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        try {
            claims.setClaimStatus("R");
            claimsDaoRemote.update(claims);

            Points points = new Points();
            points.setClaims(claims);
            points.setPointCount(-claims.getClaimCount());
            DateTime claimDate = new DateTime(claims.getClaimDate().getTime());
            points.setPointYear(claimDate.getYear());
            points.setPointMonth(claimDate.getMonthOfYear());
            points.setPointDay(claimDate.getDayOfMonth());
            points.setPointUserCode(claims.getClaimUserCode());
            Users users = usersDaoRemote.selectByUserCode(claims.getClaimUserCode());
            points.setPointPcc(users.getUserPcc());
            points.setPointSignon(users.getUserSon());
            pointsDaoRemote.insert(points);
        } catch (Exception ex) {
            errorList.add(ex.toString());
            log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
        }
        return errorList;
    }

    @Override
    public List<String> saveCreate(Claims claims, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ((claims.getClaimUserCode() == null) || "".equals(claims.getClaimUserCode())) {
            errorList.add(messageSource.getString("claim_user_code_required"));
        }
        if ("".equals(claims.getClaimDesc())) {
            errorList.add(messageSource.getString("claim_desc_required"));
        }
        if (errorList.size() == 0) {
            try {
                if ("X".equals(claims.getClaimStatus())) {
                    Points points = new Points();
                    points.setPointCount(0);
                    DateTime claimDate = new DateTime(claims.getClaimDate().getTime());
                    points.setPointYear(claimDate.getYear());
                    points.setPointMonth(claimDate.getMonthOfYear());
                    points.setPointDay(claimDate.getDayOfMonth());
                    points.setPointUserCode(claims.getClaimUserCode());
                    Users users = usersDaoRemote.selectByUserCode(claims.getClaimUserCode());
                    points.setPointPcc(users.getUserPcc());
                    points.setPointSignon(users.getUserSon());
                    points.setClaims(claims);
                    pointsDaoRemote.update(points);
                } else if ("R".equals(claims.getClaimStatus())) {
                    Points points = new Points();
                    points.setPointCount(-claims.getClaimCount());
                    DateTime claimDate = new DateTime(claims.getClaimDate().getTime());
                    points.setPointYear(claimDate.getYear());
                    points.setPointMonth(claimDate.getMonthOfYear());
                    points.setPointDay(claimDate.getDayOfMonth());
                    points.setPointUserCode(claims.getClaimUserCode());
                    Users users = usersDaoRemote.selectByUserCode(claims.getClaimUserCode());
                    points.setPointPcc(users.getUserPcc());
                    points.setPointSignon(users.getUserSon());
                    points.setClaims(claims);
                    pointsDaoRemote.update(points);
                } else {
                    claimsDaoRemote.insert(claims);
                }
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    @Override
    public List<String> saveDelete(Claims claims, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        List<Points> pointsList = pointsDaoRemote.selectPointsByClaims(claims);
        for (Points points : pointsList) {
            pointsDaoRemote.delete(points.getPointId());
        }
        claimsDaoRemote.delete(claims.getClaimId());
        return errorList;
    }
}
