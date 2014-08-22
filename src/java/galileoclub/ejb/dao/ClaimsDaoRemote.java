/*
 * ClaimsDaoRemote.java
 * 
 * Created on Dec 16, 2008, 2:46:55 PM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Claims;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface ClaimsDaoRemote {

    void insert(Claims claims);

    void update(Claims claims);

    void delete(Integer claimId);
}
