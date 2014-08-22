/*
 * RolesDaoRemote.java
 * 
 * Created on Oct 15, 2008, 11:23:41 AM
 */
package galileoclub.ejb.dao;

import java.util.List;
import javax.ejb.Remote;
import galileoclub.jpa.Roles;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface RolesDaoRemote {

    Boolean isAdminByUserName(String userName);

    List<String> getMenuList(String userName);

    Roles selectByRoleName(String roleName);

    Roles find(Integer roleId);

    void insert(Roles roles);

    void delete(Integer roleId);

    void update(Roles roles);
}
