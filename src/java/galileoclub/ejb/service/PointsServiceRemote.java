/*
 * PointsServiceRemote.java
 * 
 * Created on Jan 16, 2009, 2:13:17 PM
 */
package galileoclub.ejb.service;

import galileoclub.jpa.Points;
import java.util.List;
import java.util.Locale;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface PointsServiceRemote {

    public List<String> saveDelete(Points points, Locale locale);

    public List<String> saveUpdate(Points points, Locale locale);

    List<String> saveCreate(Points points, Locale locale);
}
