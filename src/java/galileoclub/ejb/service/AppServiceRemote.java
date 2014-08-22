/*
 * AppServiceRemote.java
 * 
 * Created on Nov 13, 2008, 10:59:04 AM
 */
package galileoclub.ejb.service;

import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface AppServiceRemote {

    String hashPassword(final String password);
}
