/*
 * RolesServiceRemote.java
 * 
 * Created on Nov 12, 2008, 1:40:45 PM
 */
package galileoclub.ejb.service;

import galileoclub.jpa.Roles;
import java.util.List;
import java.util.Locale;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface RolesServiceRemote {

    List<String> saveCreate(Roles roles, Locale locale);

    List<String> saveUpdate(Roles roles, Locale locale);

    List<String> saveDelete(Roles roles, Locale locale);
}
