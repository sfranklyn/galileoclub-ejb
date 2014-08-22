/*
 * NewsServiceRemote.java
 * 
 * Created on Feb 2, 2009, 11:19:30 AM
 */
package galileoclub.ejb.service;

import galileoclub.jpa.News;
import java.util.List;
import java.util.Locale;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface NewsServiceRemote {

    List<String> saveCreate(News news, Locale locale);

    List<String> saveUpdate(News news, Locale locale);

    List<String> saveDelete(News news, Locale locale);
}
