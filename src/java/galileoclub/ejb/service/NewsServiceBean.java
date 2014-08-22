/*
 * NewsServiceBean.java
 * 
 * Created on Feb 2, 2009, 11:19:30 AM
 */
package galileoclub.ejb.service;

import galileoclub.ejb.dao.NewsDaoRemote;
import galileoclub.jpa.News;
import galileoclub.jpa.Users;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class NewsServiceBean implements NewsServiceRemote {

    private static final Logger log = Logger.getLogger(NewsServiceBean.class.getName());
    private static final String MESSAGES = "ejbmessages";
    @PersistenceContext
    private EntityManager em;
    @EJB
    private NewsDaoRemote newsDaoRemote = null;

    public List<String> saveCreate(News news, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (news.getNewsDate() == null) {
            errorList.add(messageSource.getString("news_date_required"));
        }
        if ("".equals(news.getNewsText())) {
            errorList.add(messageSource.getString("news_text_required"));
        }
        if (news.getUserId() == null) {
            errorList.add(messageSource.getString("user_id_required"));
        }
        if (news.getUserId().getUserId() == null) {
            errorList.add(messageSource.getString("user_id_required"));
        }
        if (errorList.size() == 0) {
            try {
                Users users = em.find(Users.class, news.getUserId().getUserId());
                news.setUserId(users);
                newsDaoRemote.insert(news);
            } catch (Exception ex) {
                Throwable cause = ex.getCause();
                boolean duplicate = false;
                while (cause != null) {
                    if (cause.toString().contains("Duplicate entry")) {
                        errorList.add(messageSource.getString("news_date_already_registered"));
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

    public List<String> saveUpdate(News news, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (news.getNewsId() == null || news.getNewsId().intValue() == 0) {
            errorList.add(messageSource.getString("news_id_required"));
        }
        if (news.getNewsDate() == null) {
            errorList.add(messageSource.getString("news_date_required"));
        }
        if ("".equals(news.getNewsText())) {
            errorList.add(messageSource.getString("news_text_required"));
        }
        if (news.getUserId() == null) {
            errorList.add(messageSource.getString("user_id_required"));
        }
        if (errorList.size() == 0) {
            try {
                newsDaoRemote.update(news);
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }

    public List<String> saveDelete(News news, Locale locale) {
        List<String> errorList = new ArrayList<String>();
        ResourceBundle messageSource = ResourceBundle.getBundle(MESSAGES, locale);
        if (news.getNewsId() == null || news.getNewsId().intValue() == 0) {
            errorList.add(messageSource.getString("news_id_required"));
        }
        if (errorList.size() == 0) {
            try {
                newsDaoRemote.delete(news.getNewsId());
            } catch (Exception ex) {
                errorList.add(ex.toString());
                log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            }
        }
        return errorList;
    }
}
