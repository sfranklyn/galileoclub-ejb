/*
 * PointsDaoBean.java
 * 
 * Created on Dec 15, 2008, 3:43:22 PM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Claims;
import galileoclub.jpa.Points;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
public class PointsDaoBean implements PointsDaoRemote {

    @PersistenceContext
    private EntityManager em;

    @SuppressWarnings("unchecked")
    public List<Points> findPointsByUserCode(String userCode, Boolean ascending) {
        Query query;
        if(ascending) {
            query = em.createNamedQuery("Points.findByPointUserCodeAsc");
        } else {
            query = em.createNamedQuery("Points.findByPointUserCodeDsc");
        }
        query.setParameter("pointUserCode", userCode);
        List<Points> pointsList = new ArrayList<Points>();
        try {
            pointsList = query.getResultList();
        } catch (NoResultException ex) {
        }

        return pointsList;
    }

    public Long sumByPointUserCode(String userCode) {
        Query query = em.createNamedQuery("Points.sumByPointUserCode");
        query.setParameter("pointUserCode", userCode);
        Long count = Long.valueOf(0);
        try {
            count = (Long) query.getSingleResult();
        } catch (NoResultException ex) {
        }
        return count;
    }

    public void deleteYearMonth(Integer pointYear, Integer pointMonth) {
        Query query = em.createNamedQuery("Points.deleteYearMonth");
        query.setParameter(1, pointYear);
        query.setParameter(2, pointMonth);
        query.executeUpdate();
        em.flush();
    }

    public void insert(Points points) {
        em.persist(points);
        em.flush();
    }

    public void delete(Integer pointId) {
        Points points = em.find(Points.class, pointId);
        em.remove(points);
        em.flush();
    }

    public void update(Points points) {
        em.merge(points);
        em.flush();
    }

    @SuppressWarnings("unchecked")
    public List<Points> selectPointsByClaims(Claims claims) {
        Query query = em.createNamedQuery("Points.selectByClaims");
        query.setParameter("claims", claims);
        List<Points> pointsList = new ArrayList<Points>();
        try {
            pointsList = query.getResultList();
        } catch (NoResultException ex) {
        }
        return pointsList;
    }

    @SuppressWarnings("unchecked")
    public List<Points> selectByUserCodePccSignOnYearMonthDay(Map param) {
        Query query = em.createNamedQuery("Points.selectByUserCodePccSignOnYearMonthDay");
        query.setParameter("pointUserCode", param.get("pointUserCode"));
        query.setParameter("pointPcc", param.get("pointPcc"));
        query.setParameter("pointSignon", param.get("pointSignon"));
        query.setParameter("pointYear", param.get("pointYear"));
        query.setParameter("pointMonth", param.get("pointMonth"));
        query.setParameter("pointDay", param.get("pointDay"));
        List<Points> pointsList = new ArrayList<Points>();
        try {
            pointsList = query.getResultList();
        } catch (NoResultException ex) {
        }
        return pointsList;

    }
}
