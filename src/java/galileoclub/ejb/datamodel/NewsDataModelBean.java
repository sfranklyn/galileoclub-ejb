/*
 * NewsDataModelBean.java
 * 
 * Created on Feb 2, 2009, 11:15:55 AM
 */
package galileoclub.ejb.datamodel;

import javax.ejb.Stateless;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class NewsDataModelBean extends BaseDataModelBean implements NewsDataModelRemote {

    public static final String SELECT_ALL = "News.selectAll";
    public static final String SELECT_ALL_COUNT = "News.selectAllCount";
}
