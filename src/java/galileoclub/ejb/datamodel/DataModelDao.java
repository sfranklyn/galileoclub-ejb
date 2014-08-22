/*
 * DataModelDao.java
 * 
 * Created on Oct 16, 2008, 9:09:11 AM
 */
package galileoclub.ejb.datamodel;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Samuel Franklyn
 */
public interface DataModelDao {

    List getAll(String id, Map<String,Object> param, int first, int max);

    Long getAllCount(String id, Map<String,Object> param);
}
