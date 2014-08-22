/*
 * PnrsDaoRemote.java
 * 
 * Created on Nov 27, 2008, 4:43:13 PM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Pnrs;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface PnrsDaoRemote {

    void updateNotActive();

    void insert(Pnrs pnrs);

    void delete(Integer pnrsId);

    void update(Pnrs pnrs);

    void deleteNotActive();
}
