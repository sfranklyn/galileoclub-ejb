/*
 * UrlsRolesDaoBean.java
 * 
 * Created on Oct 16, 2008, 3:56:23 PM
 */
package galileoclub.ejb.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import galileoclub.jpa.UrlsRoles;
import galileoclub.jpa.UrlsRolesPK;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class UrlsRolesDaoBean implements UrlsRolesDaoRemote {

    @PersistenceContext
    private EntityManager em;

    public void insert(UrlsRoles urlRole) {
        em.persist(urlRole);
        em.flush();
    }

    public void delete(UrlsRolesPK urlsRolesPK) {
        UrlsRoles urlsRoles = em.find(UrlsRoles.class, urlsRolesPK);
        em.remove(urlsRoles);
        em.flush();
    }
}
