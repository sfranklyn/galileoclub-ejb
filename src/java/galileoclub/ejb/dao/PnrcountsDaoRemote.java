/*
 * PnrcountsDaoRemote.java
 * 
 * Created on Nov 28, 2008, 10:52:45 AM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Pnrcounts;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface PnrcountsDaoRemote {

    void insert(Pnrcounts pnrcounts);

    void delete(Integer pccsId);

    void update(Pnrcounts pnrcounts);
}
