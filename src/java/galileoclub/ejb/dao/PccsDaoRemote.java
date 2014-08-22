/*
 * PccsDaoRemote.java
 * 
 * Created on Nov 19, 2008, 1:43:37 PM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Pccs;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface PccsDaoRemote {

    void insert(Pccs pccs);

    void delete(Integer pccsId);

    void update(Pccs pccs);

    Pccs findByPccsPcc(String pcc);
}
