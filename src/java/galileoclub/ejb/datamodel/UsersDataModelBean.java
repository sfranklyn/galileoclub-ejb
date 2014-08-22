/*
 * UsersDataModelBean.java
 * 
 * Created on Oct 16, 2008, 3:45:35 PM
 */
package galileoclub.ejb.datamodel;

import javax.ejb.Stateless;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class UsersDataModelBean extends BaseDataModelBean implements UsersDataModelRemote {

    public static final String SELECT_ALL = "Users.selectAll";
    public static final String SELECT_ALL_COUNT = "Users.selectAllCount";
    public static final String SELECT_NEW_MEMBER = "Users.selectNewMember";
    public static final String SELECT_NEW_MEMBER_COUNT = "Users.selectNewMemberCount";
    public static final String SELECT_BY_PCC = "Users.findByUserPcc";
    public static final String SELECT_BY_PCC_COUNT = "Users.findByUserPccCount";
    public static final String SELECT_BY_FULLNAME = "Users.findByFullName";
    public static final String SELECT_BY_FULLNAME_COUNT = "Users.findByFullNameCount";
    public static final String SELECT_BY_USERCODE = "Users.findByUserCode";
    public static final String SELECT_BY_USERCODE_COUNT = "Users.findByUserCodeCount";
    public static final String SELECT_LIKE_USERNAME = "Users.likeUserName";
}
