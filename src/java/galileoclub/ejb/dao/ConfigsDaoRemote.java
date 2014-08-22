/*
 * ConfigsDaoRemote.java
 * 
 * Created on Nov 21, 2008, 1:25:25 PM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Configs;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface ConfigsDaoRemote {

    void insert(Configs configs);

    void delete(Integer configId);

    void update(Configs configs);
}
