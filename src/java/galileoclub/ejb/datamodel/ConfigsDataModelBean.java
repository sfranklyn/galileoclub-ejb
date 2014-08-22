/*
 * ConfigsDataModelBean.java
 * 
 * Created on Nov 21, 2008, 2:51:55 PM
 */
package galileoclub.ejb.datamodel;

import javax.ejb.Stateless;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class ConfigsDataModelBean extends BaseDataModelBean implements ConfigsDataModelRemote {

    public static final String SELECT_ALL = "Configs.selectAll";
    public static final String SELECT_ALL_COUNT = "Configs.selectAllCount";
}
