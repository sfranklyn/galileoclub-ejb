/*
 * ClaimsServiceRemote.java
 * 
 * Created on Dec 16, 2008, 2:48:40 PM
 */
package galileoclub.ejb.service;

import galileoclub.jpa.Claims;
import java.util.List;
import java.util.Locale;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface ClaimsServiceRemote {

    List<String> saveClaimReward(Claims claims, Locale locale);

    List<String> saveNewClaimProcess(Claims claims, Locale locale);

    List<String> saveReconfirm(Claims claims, Locale locale);

    List<String> saveCreate(Claims claims, Locale locale);

    List<String> saveDelete(Claims claims, Locale locale);
}
