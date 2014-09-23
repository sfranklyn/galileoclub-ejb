/*
 * UsersRolesDaoBean.java
 * 
 * Created on Oct 16, 2008, 4:32:16 PM
 */
package galileoclub.ejb.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import galileoclub.jpa.UsersRoles;
import galileoclub.jpa.UsersRolesPK;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class UsersRolesDaoBean implements UsersRolesDaoRemote {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(UsersRoles userRole) {
        em.persist(userRole);
        em.flush();
    }

    @Override
    public void delete(UsersRolesPK usersRolesPK) {
        UsersRoles usersRoles = em.find(UsersRoles.class, usersRolesPK);
        em.remove(usersRoles);
        em.flush();
    }
}
