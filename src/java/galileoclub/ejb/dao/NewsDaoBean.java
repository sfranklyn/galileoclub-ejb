/*
 * NewsDaoBean.java
 * 
 * Created on Feb 2, 2009, 11:12:09 AM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.News;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class NewsDaoBean implements NewsDaoRemote {

    @PersistenceContext
    private EntityManager em;

    public void insert(News news) {
        em.persist(news);
        em.flush();
    }

    public void delete(Integer newsId) {
        News news = em.find(News.class, newsId);
        em.remove(news);
        em.flush();
    }

    public void update(News news) {
        em.merge(news);
        em.flush();
    }
}
