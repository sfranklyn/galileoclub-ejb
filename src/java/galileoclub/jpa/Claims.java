/*
 * Claims.java
 * 
 * Created on Dec 9, 2008, 4:23:03 PM
 */
package galileoclub.jpa;

import galileoclub.ejb.dao.UsersDaoRemote;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Samuel Franklyn
 */
@Entity
@Table(name = "claims")
@NamedQueries({
    @NamedQuery(name = "Claims.selectAll",
    query = "SELECT c FROM Claims c ORDER BY c.claimDate DESC"),
    @NamedQuery(name = "Claims.selectAllCount",
    query = "SELECT COUNT(c) FROM Claims c"),
    @NamedQuery(name = "Claims.selectPendingByClaimUserCode",
    query = "SELECT c FROM Claims c WHERE " +
    "c.claimStatus IN ('P','C') AND " +
    "c.claimUserCode = :claimUserCode"),
    @NamedQuery(name = "Claims.selectPendingByClaimUserCodeCount",
    query = "SELECT COUNT(c) FROM Claims c WHERE " +
    "c.claimStatus IN ('P','C') AND " +
    "c.claimUserCode = :claimUserCode"),
    @NamedQuery(name = "Claims.selectPending",
    query = "SELECT c FROM Claims c WHERE " +
    "c.claimStatus = 'P' ORDER BY c.claimDate"),
    @NamedQuery(name = "Claims.selectPendingCount",
    query = "SELECT COUNT(c) FROM Claims c WHERE " +
    "c.claimStatus = 'P'"),
    @NamedQuery(name = "Claims.findByClaimId",
    query = "SELECT c FROM Claims c WHERE c.claimId = :claimId"),
    @NamedQuery(name = "Claims.selectByClaimUserCode",
    query = "SELECT c FROM Claims c WHERE c.claimUserCode = :claimUserCode"),
    @NamedQuery(name = "Claims.selectByClaimUserCodeCount",
    query = "SELECT COUNT(c) FROM Claims c WHERE c.claimUserCode = :claimUserCode"),
    @NamedQuery(name = "Claims.findByClaimDate",
    query = "SELECT c FROM Claims c WHERE c.claimDate = :claimDate"),
    @NamedQuery(name = "Claims.findByClaimDesc",
    query = "SELECT c FROM Claims c WHERE c.claimDesc = :claimDesc"),
    @NamedQuery(name = "Claims.findByClaimResponse",
    query = "SELECT c FROM Claims c WHERE c.claimResponse = :claimResponse"),
    @NamedQuery(name = "Claims.findByClaimCount",
    query = "SELECT c FROM Claims c WHERE c.claimCount = :claimCount"),
    @NamedQuery(name = "Claims.selectByClaimStatus",
    query = "SELECT c FROM Claims c WHERE c.claimStatus = :claimStatus ORDER BY c.claimDate DESC"),
    @NamedQuery(name = "Claims.selectByClaimStatusCount",
    query = "SELECT COUNT(c) FROM Claims c WHERE c.claimStatus = :claimStatus"),
    @NamedQuery(name = "Claims.findByClaimRefDoc",
    query = "SELECT c FROM Claims c WHERE c.claimRefDoc = :claimRefDoc")
})
public class Claims implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "claim_id", nullable = false)
    private Integer claimId;
    @Basic(optional = false)
    @Column(name = "claim_user_code", nullable = false, length = 12)
    private String claimUserCode;
    @Basic(optional = false)
    @Column(name = "claim_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date claimDate;
    @Basic(optional = false)
    @Column(name = "claim_desc", nullable = false, length = 255)
    private String claimDesc;
    @Basic(optional = false)
    @Column(name = "claim_response", length = 255)
    private String claimResponse;
    @Basic(optional = false)
    @Column(name = "claim_count", nullable = false)
    private int claimCount;
    @Basic(optional = false)
    @Column(name = "claim_status", nullable = false)
    private String claimStatus;
    @Column(name = "claim_ref_doc", length = 50)
    private String claimRefDoc;
    @OneToMany(mappedBy = "claims")
    private Collection<Points> pointsCollection;
    @Transient
    private Users users;
    

    public Claims() {
    }

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public String getClaimUserCode() {
        return claimUserCode;
    }

    public Users getUsers() throws NamingException {
        if (users == null) {
            InitialContext ic = new InitialContext();
            UsersDaoRemote usersDaoRemote = (UsersDaoRemote) ic.lookup("galileoclub.ejb.dao.UsersDaoRemote");
            users = usersDaoRemote.selectByUserCode(claimUserCode);
        }
        return users;
    }

    public void setClaimUserCode(String claimUserCode) {
        this.claimUserCode = claimUserCode;
    }

    public String getClaimDateFormatted() {
        DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MMM-yyyy HH:mm:ss");
        return dtf.print(claimDate.getTime());
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public String getClaimDesc() {
        return claimDesc;
    }

    public void setClaimDesc(String claimDesc) {
        this.claimDesc = claimDesc;
    }

    public String getClaimResponse() {
        return claimResponse;
    }

    public void setClaimResponse(String claimResponse) {
        this.claimResponse = claimResponse;
    }

    public int getClaimCount() {
        return claimCount;
    }

    public void setClaimCount(int claimCount) {
        this.claimCount = claimCount;
    }

    public String getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public String getClaimRefDoc() {
        return claimRefDoc;
    }

    public void setClaimRefDoc(String claimRefDoc) {
        this.claimRefDoc = claimRefDoc;
    }

    public Collection<Points> getPointsCollection() {
        return pointsCollection;
    }

    public void setPointsCollection(Collection<Points> pointsCollection) {
        this.pointsCollection = pointsCollection;
    }

}
