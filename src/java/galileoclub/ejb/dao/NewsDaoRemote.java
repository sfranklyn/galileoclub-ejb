/*
 * NewsDaoRemote.java
 * 
 * Created on Feb 2, 2009, 11:12:09 AM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.News;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface NewsDaoRemote {

    void insert(News news);

    void delete(Integer newsId);

    void update(News news);
}
