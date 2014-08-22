/*
 * ClaimsDaoBean.java
 * 
 * Created on Dec 16, 2008, 2:46:54 PM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Claims;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class ClaimsDaoBean implements ClaimsDaoRemote {

    @PersistenceContext
    private EntityManager em;

    public void insert(Claims claims) {
        em.persist(claims);
        em.flush();
    }

    public void update(Claims claims) {
        em.merge(claims);
        em.flush();
    }

    public void delete(Integer claimId) {
        Claims claims = em.find(Claims.class, claimId);
        em.remove(claims);
        em.flush();
    }
}
