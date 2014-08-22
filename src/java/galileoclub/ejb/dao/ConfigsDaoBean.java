/*
 * ConfigsDaoBean.java
 * 
 * Created on Nov 21, 2008, 1:25:25 PM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Configs;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class ConfigsDaoBean implements ConfigsDaoRemote {

    @PersistenceContext
    private EntityManager em;

    public void insert(Configs configs) {
        em.persist(configs);
        em.flush();
    }

    public void delete(Integer configId) {
        Configs configs = em.find(Configs.class, configId);
        em.remove(configs);
        em.flush();
    }

    public void update(Configs configs) {
        em.merge(configs);
        em.flush();
    }
}
