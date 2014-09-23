/*
 * UsersPccsDataModelBean.java
 * 
 * Created on Sep 8, 2014, 9:37:25 AM
 */
package galileoclub.ejb.datamodel;

import javax.ejb.Stateless;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class UsersPccsDataModelBean extends BaseDataModelBean implements UsersPccsDataModelRemote {

    public static final String SELECT_ALL = "UsersPccs.selectAll";
    public static final String SELECT_ALL_COUNT = "UsersPccs.selectAllCount";
    public static final String SELECT_BY_USER = "UsersPccs.selectByUser";
    public static final String SELECT_BY_USER_COUNT = "UsersPccs.selectByUserCount";
}
