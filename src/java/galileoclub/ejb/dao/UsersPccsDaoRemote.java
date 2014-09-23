/*
 * UsersPccsDaoBeanRemote.java
 * 
 * Created on Sep 8, 2014, 9:21:44 AM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.UsersPccs;
import galileoclub.jpa.UsersPccsPK;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface UsersPccsDaoRemote {

    public void insert(UsersPccs UsersPccs);

    public void update(UsersPccs UsersPccs);

    public void delete(UsersPccsPK UsersPccsPK);
}
