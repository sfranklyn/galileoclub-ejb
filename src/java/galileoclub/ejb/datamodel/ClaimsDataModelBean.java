/*
 * ClaimsDataModelBean.java
 * 
 * Created on Dec 16, 2008, 4:53:34 PM
 */
package galileoclub.ejb.datamodel;

import javax.ejb.Stateless;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class ClaimsDataModelBean extends BaseDataModelBean implements ClaimsDataModelRemote {

    public static final String SELECT_ALL = "Claims.selectAll";
    public static final String SELECT_ALL_COUNT = "Claims.selectAllCount";
    public static final String SELECT_PENDING_BY_CLAIMUSERCODE = "Claims.selectPendingByClaimUserCode";
    public static final String SELECT_PENDING_BY_CLAIMUSERCODE_COUNT = "Claims.selectPendingByClaimUserCodeCount";
    public static final String SELECT_PENDING = "Claims.selectPending";
    public static final String SELECT_PENDING_COUNT = "Claims.selectPendingCount";
    public static final String SELECT_BY_CLAIMUSERCODE = "Claims.selectByClaimUserCode";
    public static final String SELECT_BY_CLAIMUSERCODE_COUNT = "Claims.selectByClaimUserCodeCount";
    public static final String SELECT_BY_CLAIMSTATUS = "Claims.selectByClaimStatus";
    public static final String SELECT_BY_CLAIMSTATUS_COUNT = "Claims.selectByClaimStatusCount";
}
