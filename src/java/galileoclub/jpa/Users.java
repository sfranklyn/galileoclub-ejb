/*
 * Users.java
 * 
 * Created on Oct 15, 2008, 10:51:09 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @author Samuel Franklyn
 */
@Entity
@Table(name = "users")
@NamedQueries({
    @NamedQuery(name = "Users.selectByUserIdUrl",
    query = "SELECT u " +
    "FROM " +
    "Users u, UsersRoles ur, UrlsRoles urls " +
    "WHERE " +
    "u.userId = :userId AND " +
    "u = ur.users AND " +
    "ur.roles = urls.roles AND " +
    "urls.urlsRolesPK.urlRole = :urlRole"),
    @NamedQuery(name = "Users.selectAll",
    query = "SELECT u FROM Users u ORDER BY u.userCode"),
    @NamedQuery(name = "Users.selectAllCount",
    query = "SELECT COUNT(u) FROM Users u"),
    @NamedQuery(name = "Users.selectNewMember",
    query = "SELECT u FROM Users u WHERE u.userStatus='P' ORDER BY u.userCreated"),
    @NamedQuery(name = "Users.selectNewMemberCount",
    query = "SELECT COUNT(u) FROM Users u WHERE u.userStatus='P'"),
    @NamedQuery(name = "Users.selectMaxUserCode",
    query = "SELECT MAX(u.userCode) FROM Users u WHERE u.userCode LIKE :userCodePrefix"),
    @NamedQuery(name = "Users.findByUserId",
    query = "SELECT u FROM Users u WHERE u.userId = :userId"),
    @NamedQuery(name = "Users.findByUserName",
    query = "SELECT u FROM Users u WHERE u.userName = :userName"),
    @NamedQuery(name = "Users.findByUserCode",
    query = "SELECT u FROM Users u WHERE u.userCode LIKE :userCode"),
    @NamedQuery(name = "Users.findByUserCodeCount",
    query = "SELECT COUNT(u) FROM Users u WHERE u.userCode LIKE :userCode"),
    @NamedQuery(name = "Users.findByFullName",
    query = "SELECT u FROM Users u WHERE u.fullName LIKE :fullName"),
    @NamedQuery(name = "Users.findByFullNameCount",
    query = "SELECT COUNT(u) FROM Users u WHERE u.fullName LIKE :fullName"),
    @NamedQuery(name = "Users.findByUserPassword",
    query = "SELECT u FROM Users u WHERE u.userPassword = :userPassword"),
    @NamedQuery(name = "Users.findByUserPcc",
    query = "SELECT u FROM Users u WHERE u.userPcc = :userPcc"),
    @NamedQuery(name = "Users.findByUserPccCount",
    query = "SELECT COUNT(u) FROM Users u WHERE u.userPcc = :userPcc"),
    @NamedQuery(name = "Users.findByUserPccSignOn",
    query = "SELECT u FROM Users u WHERE u.userPcc = :userPcc AND u.userSon = :userSon"),
    @NamedQuery(name = "Users.likeUserName",
    query = "SELECT u FROM Users u WHERE u.userName LIKE :userName"),
    @NamedQuery(name = "Users.setUserPointValue",
    query = "UPDATE Users u SET u.userPointValue = :userPointValueInto " +
            "WHERE u.userPointValue = :userPointValueFrom")
})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Integer userId;
    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;
    @Column(name = "user_code", length = 12)
    private String userCode;
    @Column(name = "full_name", nullable = false, length = 100)
    private String fullName;
    @Column(name = "user_password", nullable = false, length = 128)
    private String userPassword;
    @Column(name = "user_email", length = 200)
    private String userEmail;
    @Column(name = "user_birthday")
    @Temporal(TemporalType.DATE)
    private Date userBirthday;
    @Column(name = "user_pcc", length = 10)
    private String userPcc;
    @Column(name = "user_son", length = 10)
    private String userSon;
    @Column(name = "user_pcc1", length = 10)
    private String userPcc1;
    @Column(name = "user_son1", length = 10)
    private String userSon1;
    @Column(name = "user_agentname", length = 50)
    private String userAgentName;
    @Column(name = "user_office_address1", length = 50)
    private String userOfficeAddress1;
    @Column(name = "user_office_address2", length = 50)
    private String userOfficeAddress2;
    @Column(name = "user_office_address3", length = 50)
    private String userOfficeAddress3;
    @Column(name = "user_office_city", length = 30)
    private String userOfficeCity;
    @Column(name = "user_office_zip", length = 10)
    private String userOfficeZip;
    @Column(name = "user_office_phone", length = 30)
    private String userOfficePhone;
    @Column(name = "user_office_ext", length = 15)
    private String userOfficeExt;
    @Column(name = "user_office_fax", length = 30)
    private String userOfficeFax;
    @Column(name = "user_mobile_phone", length = 15)
    private String userMobilePhone;
    @Column(name = "user_status", length = 1)
    private String userStatus;
    @Column(name = "user_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userCreated;
    @Column(name = "user_created_by", length = 50)
    private String userCreatedBy;
    @Column(name = "user_activated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userActivated;
    @Column(name = "user_activated_by", length = 50)
    private String userActivatedBy;
    @Column(name = "user_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userUpdate;
    @Column(name = "user_updated_by", length = 50)
    private String userUpdatedBy;
    @Version
    @Column(name = "user_version", nullable = false)
    private Integer userVersion;
    @Column(name = "user_point_value")
    private Integer userPointValue;
    @Lob
    @Column(name = "user_notes", length = 16777215)
    private String userNotes;

    public Users() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPcc() {
        return userPcc;
    }

    public void setUserPcc(String userPcc) {
        this.userPcc = userPcc;
    }

    public String getUserSon() {
        return userSon;
    }

    public void setUserSon(String userSon) {
        this.userSon = userSon;
    }

    public String getUserPcc1() {
        return userPcc1;
    }

    public void setUserPcc1(String userPcc1) {
        this.userPcc1 = userPcc1;
    }

    public String getUserSon1() {
        return userSon1;
    }

    public void setUserSon1(String userSon1) {
        this.userSon1 = userSon1;
    }

    public String getUserAgentName() {
        return userAgentName;
    }

    public void setUserAgentName(String userAgentName) {
        this.userAgentName = userAgentName;
    }

    public String getUserOfficeAddress1() {
        return userOfficeAddress1;
    }

    public void setUserOfficeAddress1(String userOfficeAddress1) {
        this.userOfficeAddress1 = userOfficeAddress1;
    }

    public String getUserOfficeAddress2() {
        return userOfficeAddress2;
    }

    public void setUserOfficeAddress2(String userOfficeAddress2) {
        this.userOfficeAddress2 = userOfficeAddress2;
    }

    public String getUserOfficeAddress3() {
        return userOfficeAddress3;
    }

    public void setUserOfficeAddress3(String userOfficeAddress3) {
        this.userOfficeAddress3 = userOfficeAddress3;
    }

    public String getUserOfficeCity() {
        return userOfficeCity;
    }

    public void setUserOfficeCity(String userOfficeCity) {
        this.userOfficeCity = userOfficeCity;
    }

    public String getUserOfficeZip() {
        return userOfficeZip;
    }

    public void setUserOfficeZip(String userOfficeZip) {
        this.userOfficeZip = userOfficeZip;
    }

    public String getUserOfficePhone() {
        return userOfficePhone;
    }

    public void setUserOfficePhone(String userOfficePhone) {
        this.userOfficePhone = userOfficePhone;
    }

    public String getUserOfficeExt() {
        return userOfficeExt;
    }

    public void setUserOfficeExt(String userOfficeExt) {
        this.userOfficeExt = userOfficeExt;
    }

    public String getUserOfficeFax() {
        return userOfficeFax;
    }

    public void setUserOfficeFax(String userOfficeFax) {
        this.userOfficeFax = userOfficeFax;
    }

    public String getUserMobilePhone() {
        return userMobilePhone;
    }

    public void setUserMobilePhone(String userMobilePhone) {
        this.userMobilePhone = userMobilePhone;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public Date getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Date userCreated) {
        this.userCreated = userCreated;
    }

    public String getUserCreatedBy() {
        return userCreatedBy;
    }

    public void setUserCreatedBy(String userCreatedBy) {
        this.userCreatedBy = userCreatedBy;
    }

    public Date getUserActivated() {
        return userActivated;
    }

    public void setUserActivated(Date userActivated) {
        this.userActivated = userActivated;
    }

    public String getUserActivatedBy() {
        return userActivatedBy;
    }

    public void setUserActivatedBy(String userActivatedBy) {
        this.userActivatedBy = userActivatedBy;
    }

    public Date getUserUpdate() {
        return userUpdate;
    }

    public void setUserUpdate(Date userUpdate) {
        this.userUpdate = userUpdate;
    }

    public String getUserUpdatedBy() {
        return userUpdatedBy;
    }

    public void setUserUpdatedBy(String userUpdatedBy) {
        this.userUpdatedBy = userUpdatedBy;
    }

    public Integer getUserVersion() {
        return userVersion;
    }

    public void setUserVersion(Integer userVersion) {
        this.userVersion = userVersion;
    }

    public Integer getUserPointValue() {
        return userPointValue;
    }

    public void setUserPointValue(Integer userPointValue) {
        this.userPointValue = userPointValue;
    }

    public String getUserNotes() {
        return userNotes;
    }

    public void setUserNotes(String userNotes) {
        this.userNotes = userNotes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
