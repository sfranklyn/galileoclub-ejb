/*
 * RolesDaoBean.java
 * 
 * Created on Oct 15, 2008, 11:23:41 AM
 */
package galileoclub.ejb.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import galileoclub.jpa.Roles;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class RolesDaoBean implements RolesDaoRemote {

    @PersistenceContext
    private EntityManager em;

    public Boolean isAdminByUserName(String userName) {
        Query query = em.createNamedQuery("Roles.isAdminByUserName");
        query.setParameter("userName", userName);
        if (query.getResultList().size() > 0) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    @SuppressWarnings("unchecked")
    public List<String> getMenuList(String userName) {
        Query query = em.createNamedQuery("Roles.selectMenuByUserName");
        query.setParameter("userName", userName);
        return (List<String>) query.getResultList();
    }

    public Roles selectByRoleName(String roleName) {
        Query query = em.createNamedQuery("Roles.findByRoleName");
        query.setParameter("roleName", roleName);
        Roles roles = null;
        try {
            roles = (Roles) query.getSingleResult();
        } catch (NoResultException ex) {
        }
        return roles;
    }

    public Roles find(Integer roleId) {
        return em.find(Roles.class, roleId);
    }

    public void insert(Roles roles) {
        em.persist(roles);
        em.flush();
    }

    public void delete(Integer roleId) {
        Roles roles = em.find(Roles.class, roleId);
        em.remove(roles);
        em.flush();
    }

    public void update(Roles roles) {
        em.merge(roles);
        em.flush();
    }
}
