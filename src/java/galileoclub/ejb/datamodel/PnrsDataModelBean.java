/*
 * PnrsDataModelBean.java
 * 
 * Created on Nov 27, 2008, 5:27:45 PM
 */
package galileoclub.ejb.datamodel;

import javax.ejb.Stateless;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class PnrsDataModelBean extends BaseDataModelBean implements PnrsDataModelRemote {

    public static final String SELECT_ALL = "Pnrs.selectAll";
    public static final String SELECT_ALL_COUNT = "Pnrs.selectAllCount";
    public static final String SELECT_BY_KEY = "Pnrs.selectByKey";
    public static final String SELECT_BY_ACTIVE = "Pnrs.selectByActive";
}
