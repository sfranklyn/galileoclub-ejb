/*
 * UsersPccsServiceBeanRemote.java
 * 
 * Created on Sep 10, 2014, 1:05:23 PM
 */
package galileoclub.ejb.service;

import galileoclub.jpa.UsersPccs;
import java.util.List;
import java.util.Locale;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface UsersPccsServiceRemote {

    public List<String> saveDelete(UsersPccs UsersPccs, Locale locale);

    public List<String> saveCreate(UsersPccs UsersPccs, Locale locale);
}
