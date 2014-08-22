/*
 * PccsDaoBean.java
 * 
 * Created on Nov 19, 2008, 1:43:37 PM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Pccs;
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
public class PccsDaoBean implements PccsDaoRemote {

    @PersistenceContext
    private EntityManager em;

    public void insert(Pccs pccs) {
        em.persist(pccs);
        em.flush();
    }

    public void delete(Integer pccsId) {
        Pccs pccs = em.find(Pccs.class, pccsId);
        em.remove(pccs);
        em.flush();
    }

    public void update(Pccs pccs) {
        em.merge(pccs);
        em.flush();
    }

    public Pccs findByPccsPcc(String pcc) {
        Pccs pccs = null;
        Query qry = em.createNamedQuery("Pccs.findByPccsPcc");
        qry.setParameter("pccsPcc", pcc);
        try {
            pccs = (Pccs) qry.getSingleResult();
        } catch (NoResultException ex) {
        }
        return pccs;
    }
}
