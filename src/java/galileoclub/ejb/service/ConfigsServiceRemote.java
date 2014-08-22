/*
 * ConfigsServiceRemote.java
 * 
 * Created on Nov 21, 2008, 2:53:18 PM
 */
package galileoclub.ejb.service;

import galileoclub.jpa.Configs;
import java.util.List;
import java.util.Locale;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface ConfigsServiceRemote {

    Configs getByKey(String configKey);

    List<String> saveCreate(Configs configs, Locale locale);

    List<String> saveUpdate(Configs configs, Locale locale);

    List<String> saveDelete(Configs configs, Locale locale);
}
