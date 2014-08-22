/*
 * PointsServiceBean.java
 * 
 * Created on Jan 16, 2009, 2:13:17 PM
 */
package galileoclub.ejb.service;

import galileoclub.ejb.dao.PointsDaoRemote;
import galileoclub.jpa.Points;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
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
public class PointsServiceBean implements PointsServiceRemote {

    private static final Logger log = Logger.getLogger(PointsServiceBean.class.getName());
    private static final String MESSAGES = "ejbmessages";
    @EJB
    private PointsDaoRemote pointsDaoRemote = null;

    public List<String> saveCreate(Points points, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if ("".equals(points.getPointUserCode())) {
            errorList.add(messageSource.getString("point_user_code_required"));
        }
        if ("".equals(points.getPointPcc())) {
            errorList.add(messageSource.getString("point_pcc_required"));
        }
        if ("".equals(points.getPointSignon())) {
            errorList.add(messageSource.getString("point_signon_required"));
        }
        if (points.getPointYear() <= 0) {
            errorList.add(messageSource.getString("point_year_must_greater_than_zero"));
        }
        if (points.getPointMonth() <= 0) {
            errorList.add(messageSource.getString("point_month_must_greater_than_zero"));
        }
        if (points.getPointDay() <= 0) {
            errorList.add(messageSource.getString("point_day_must_greater_than_zero"));
        }
        if (errorList.size() == 0) {
            try {
                DateTime pointDate = new DateTime(points.getPointYear(), points.getPointMonth(),
                        points.getPointDay(), 0, 0, 0, 0);
                pointsDaoRemote.insert(points);
            } catch (Exception ex) {
                Throwable cause = ex.getCause();
                boolean duplicate = false;
                while (cause != null) {
                    if (cause.toString().contains("Duplicate entry")) {
                        errorList.add(messageSource.getString("point_already_registered"));
                        duplicate = true;
                    }
                    cause = cause.getCause();
                }
                boolean invalidDate = false;
                if (errorList.size() == 0) {
                    if (ex.toString().contains("org.joda.time.IllegalFieldValueException")) {
                        errorList.add(messageSource.getString("point_date_not_valid"));
                        invalidDate = true;
                    } else {
                        errorList.add(ex.toString());
                    }
                }
                if (!duplicate && !invalidDate) {
                    log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
                }
            }
        }
        return errorList;
    }

    public List<String> saveDelete(Points points, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (points.getPointId() == null || points.getPointId().intValue() == 0) {
            errorList.add(messageSource.getString("point_id_required"));
        }
        if (errorList.size() == 0) {
            try {
                pointsDaoRemote.delete(points.getPointId());
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    public List<String> saveUpdate(Points points, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (points.getPointId() == null || points.getPointId().intValue() == 0) {
            errorList.add(messageSource.getString("point_id_required"));
        }
        if ("".equals(points.getPointUserCode())) {
            errorList.add(messageSource.getString("point_user_code_required"));
        }
        if ("".equals(points.getPointPcc())) {
            errorList.add(messageSource.getString("point_pcc_required"));
        }
        if ("".equals(points.getPointSignon())) {
            errorList.add(messageSource.getString("point_signon_required"));
        }
        if (points.getPointYear() <= 0) {
            errorList.add(messageSource.getString("point_year_must_greater_than_zero"));
        }
        if (points.getPointMonth() <= 0) {
            errorList.add(messageSource.getString("point_month_must_greater_than_zero"));
        }
        if (points.getPointDay() <= 0) {
            errorList.add(messageSource.getString("point_day_must_greater_than_zero"));
        }
        if (errorList.size() == 0) {
            try {
                DateTime pointDate = new DateTime(points.getPointYear(), points.getPointMonth(),
                        points.getPointDay(), 0, 0, 0, 0);
                pointsDaoRemote.update(points);
            } catch (Exception ex) {
                if (ex.toString().contains("org.joda.time.IllegalFieldValueException")) {
                    errorList.add(messageSource.getString("point_date_not_valid"));
                } else {
                    errorList.add(ex.toString());
                    log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
                }
            }
        }
        return errorList;
    }
}
