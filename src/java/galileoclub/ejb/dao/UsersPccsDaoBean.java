/*
 * UsersPccsDaoBean.java
 * 
 * Created on Sep 8, 2014, 9:21:44 AM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.UsersPccsPK;
import galileoclub.jpa.UsersPccs;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class UsersPccsDaoBean implements UsersPccsDaoRemote {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(UsersPccs UsersPccs) {
        em.persist(UsersPccs);
        em.flush();
    }

    @Override
    public void update(UsersPccs UsersPccs) {
        em.merge(UsersPccs);
        em.flush();
    }

    @Override
    public void delete(UsersPccsPK UsersPccsPK) {
        UsersPccs UsersPccs = em.find(UsersPccs.class, UsersPccsPK);
        em.remove(UsersPccs);
        em.flush();
    }
}
