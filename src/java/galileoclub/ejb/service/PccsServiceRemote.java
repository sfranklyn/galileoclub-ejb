/*
 * PccsServiceRemote.java
 * 
 * Created on Nov 18, 2008, 2:20:06 PM
 */
package galileoclub.ejb.service;

import galileoclub.jpa.Pccs;
import java.util.List;
import java.util.Locale;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface PccsServiceRemote {

    List<String> saveCreate(Pccs pccs, Locale locale);

    List<String> saveUpdate(Pccs pccs, Locale locale);

    List<String> saveDelete(Pccs pccs, Locale locale);
    
    void createPccs();
}
