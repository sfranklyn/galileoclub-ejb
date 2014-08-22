/*
 * UsersRolesDaoRemote.java
 * 
 * Created on Oct 16, 2008, 4:32:16 PM
 */
package galileoclub.ejb.dao;

import javax.ejb.Remote;
import galileoclub.jpa.UsersRoles;
import galileoclub.jpa.UsersRolesPK;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface UsersRolesDaoRemote {

    void insert(UsersRoles userRole);

    void delete(UsersRolesPK usersRolesPK);
}
