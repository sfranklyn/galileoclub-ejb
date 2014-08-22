/*
 * UsersRolesServiceRemote.java
 * 
 * Created on Nov 13, 2008, 10:36:08 AM
 */
package galileoclub.ejb.service;

import galileoclub.jpa.UsersRoles;
import java.util.List;
import java.util.Locale;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface UsersRolesServiceRemote {

    List<String> saveCreate(UsersRoles usersRoles, Locale locale);

    List<String> saveDelete(UsersRoles usersRoles, Locale locale);
}
