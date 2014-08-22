/*
 * UrlsRolesServiceRemote.java
 * 
 * Created on Nov 13, 2008, 6:06:11 PM
 */
package galileoclub.ejb.service;

import galileoclub.jpa.UrlsRoles;
import java.util.List;
import java.util.Locale;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface UrlsRolesServiceRemote {

    List<String> saveCreate(UrlsRoles urlsRoles, Locale locale);

    List<String> saveDelete(UrlsRoles urlsRoles, Locale locale);
}
