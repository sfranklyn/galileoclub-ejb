/*
 * UsersServiceRemote.java
 * 
 * Created on Nov 13, 2008, 10:02:18 AM
 */
package galileoclub.ejb.service;

import galileoclub.jpa.Users;
import java.util.List;
import java.util.Locale;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface UsersServiceRemote {

    List<String> saveCreate(Users users,
            String userPassword1, String userPassword2, Locale locale);

    List<String> saveUpdate(Users users, Locale locale);

    List<String> saveDelete(Users users, Locale locale);

    List<String> saveChangePassword(Users users,
            String userPassword1, String userPassword2, Locale locale);

    List<String> logIn(String userName, String userPassword, Locale locale);

    List<String> reject(Users users, Locale locale);

    List<String> activate(Users users, Locale locale, String userName);

    List<String> transferToPoint(Users users, Locale locale);

    List<String> setUserPointValue(Integer userPointValueFrom, Integer userPointValueInto, Locale locale);
}
