/*
 * PccsDataModelBean.java
 * 
 * Created on Nov 17, 2008, 11:54:39 AM
 */
package galileoclub.ejb.datamodel;

import javax.ejb.Stateless;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class PccsDataModelBean extends BaseDataModelBean implements PccsDataModelRemote {

    public static final String SELECT_ALL = "Pccs.selectAll";
    public static final String SELECT_ALL_COUNT = "Pccs.selectAllCount";
    public static final String SELECT_BY_PCC = "Pccs.findByPccsPcc";
    public static final String SELECT_BY_PCC_COUNT = "Pccs.findByPccsPccCount";
}
