/*
 * UsersDaoBean.java
 * 
 * Created on Oct 16, 2008, 2:45:47 PM
 */
package galileoclub.ejb.dao;

import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import galileoclub.jpa.Users;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class UsersDaoBean implements UsersDaoRemote {

    @PersistenceContext
    private EntityManager em;

    public Users selectByUserName(String userName) {
        Query query = em.createNamedQuery("Users.findByUserName");
        query.setParameter("userName", userName);
        Users users = null;
        try {
            users = (Users) query.getSingleResult();
        } catch (NoResultException ex) {
        }
        return users;
    }

    @SuppressWarnings("unchecked")
    public List<Users> selectLikeUserName(String userName) {
        Query query = em.createNamedQuery("Users.likeUserName");
        query.setParameter("userName", userName+"%");
        List<Users> usersList = null;
        try {
            usersList = (List<Users>) query.getResultList();
        } catch (NoResultException ex) {
        }
        return usersList;
    }

    public Users selectByUserCode(String userCode) {
        Query query = em.createNamedQuery("Users.findByUserCode");
        query.setParameter("userCode", userCode);
        Users users = null;
        try {
            users = (Users) query.getSingleResult();
        } catch (NoResultException ex) {
        }
        return users;
    }

    @SuppressWarnings("unchecked")
    public List<Users> selectByUserPccSon(String userPcc, String userSon) {
        Query query = em.createNamedQuery("Users.findByUserPccSignOn");
        query.setParameter("userPcc", userPcc);
        query.setParameter("userSon", userSon);
        List<Users> usersList = new ArrayList<Users>();
        try {
            usersList = query.getResultList();
        } catch (NoResultException ex) {
        }
        return usersList;
    }

    public void insert(Users users) {
        em.persist(users);
        em.flush();
    }

    public void delete(Integer userId) {
        Users users = em.find(Users.class, userId);
        em.remove(users);
        em.flush();
    }

    public void update(Users users) {
        em.merge(users);
        em.flush();
    }

    public void setUserPointValue(Integer userPointValueFrom, Integer userPointValueInto) {
        Query query = em.createNamedQuery("Users.setUserPointValue");
        query.setParameter("userPointValueInto", userPointValueInto);
        query.setParameter("userPointValueFrom", userPointValueFrom);
        query.executeUpdate();
        em.flush();
    }

    @SuppressWarnings("unchecked")
    public List<Users> selectByUserIdUrl(Map param) {
        Query query = em.createNamedQuery("Users.selectByUserIdUrl");
        query.setParameter("userId", param.get("userId"));
        query.setParameter("urlRole", param.get("urlRole"));
        return query.getResultList();
    }

    public String getNextUserCode() {
        Query query = em.createNamedQuery("Users.selectMaxUserCode");
        DateTime today = new DateTime();
        query.setParameter("userCodePrefix", "GC/" + today.getYear() + "/%");
        String maxUserCode = "";
        try {
            maxUserCode = (String) query.getSingleResult();
        } catch (NoResultException ex) {
        }
        String nextUserCode = "";
        if (maxUserCode != null) {
            Integer count = Integer.valueOf(maxUserCode.substring(8));
            count++;
            String strCount = count.toString();
            while (strCount.length() < 4) {
                strCount = "0" + strCount;
            }
            nextUserCode = "GC/" + today.getYear() + "/" + strCount;
        } else {
            nextUserCode = "GC/" + today.getYear() + "/0001";
        }
        return nextUserCode;
    }
}
