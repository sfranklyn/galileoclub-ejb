/*
 * PnrcountsDaoBean.java
 * 
 * Created on Nov 28, 2008, 10:52:45 AM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Pnrcounts;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class PnrcountsDaoBean implements PnrcountsDaoRemote {

    @PersistenceContext
    private EntityManager em;

    public void insert(Pnrcounts pnrcounts) {
        em.persist(pnrcounts);
        em.flush();
    }

    public void delete(Integer pnrcountsId) {
        Pnrcounts pnrcounts = em.find(Pnrcounts.class, pnrcountsId);
        em.remove(pnrcounts);
        em.flush();
    }

    public void update(Pnrcounts pnrcounts) {
        em.merge(pnrcounts);
        em.flush();
    }
}
