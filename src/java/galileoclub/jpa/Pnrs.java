/*
 * Pnrs.java
 * 
 * Created on Nov 12, 2008, 11:06:20 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Samuel Franklyn
 */
@Entity
@Table(name = "pnrs")
@NamedQueries({
    @NamedQuery(name = "Pnrs.selectAll",
    query = "SELECT p FROM Pnrs p"),
    @NamedQuery(name = "Pnrs.selectAllCount",
    query = "SELECT COUNT(p) FROM Pnrs p"),
    @NamedQuery(name = "Pnrs.selectByKey",
    query = "SELECT p FROM Pnrs p WHERE " +
    "p.pnrsPcc = :pnrsPcc AND " +
    "p.pnrsRecloc = :pnrsRecloc AND " +
    "p.pnrsCreated = :pnrsCreated "),
    @NamedQuery(name = "Pnrs.selectByActive",
    query = "SELECT p FROM Pnrs p WHERE " +
    "p.pnrsActive = TRUE OR " +
    "p.pnrsDeparted >= :pnrsDeparted"),
    @NamedQuery(name = "Pnrs.updateNotActive",
    query = "UPDATE Pnrs p SET p.pnrsActive = FALSE"),
    @NamedQuery(name = "Pnrs.deleteNotActive",
    query = "DELETE FROM Pnrs p WHERE " +
    "p.pnrsActive = FALSE"),
    @NamedQuery(name = "Pnrs.findByPnrsId",
    query = "SELECT p FROM Pnrs p WHERE p.pnrsId = :pnrsId"),
    @NamedQuery(name = "Pnrs.findByPnrsPcc",
    query = "SELECT p FROM Pnrs p WHERE p.pnrsPcc = :pnrsPcc"),
    @NamedQuery(name = "Pnrs.findByPnrsSignon",
    query = "SELECT p FROM Pnrs p WHERE p.pnrsSignon = :pnrsSignon"),
    @NamedQuery(name = "Pnrs.findByPnrsRecloc",
    query = "SELECT p FROM Pnrs p WHERE p.pnrsRecloc = :pnrsRecloc"),
    @NamedQuery(name = "Pnrs.findByPnrsCreated",
    query = "SELECT p FROM Pnrs p WHERE p.pnrsCreated = :pnrsCreated"),
    @NamedQuery(name = "Pnrs.findByPnrsDeparted",
    query = "SELECT p FROM Pnrs p WHERE p.pnrsDeparted = :pnrsDeparted"),
    @NamedQuery(name = "Pnrs.findByPnrsActive",
    query = "SELECT p FROM Pnrs p WHERE p.pnrsActive = :pnrsActive"),
    @NamedQuery(name = "Pnrs.findByPnrsNew",
    query = "SELECT p FROM Pnrs p WHERE p.pnrsNew = :pnrsNew"),
    @NamedQuery(name = "Pnrs.findByPnrsCount",
    query = "SELECT p FROM Pnrs p WHERE p.pnrsCount = :pnrsCount"),
    @NamedQuery(name = "Pnrs.findByPnrsWaitcount",
    query = "SELECT p FROM Pnrs p WHERE p.pnrsWaitcount = :pnrsWaitcount"),
    @NamedQuery(name = "Pnrs.findByPnrsVersion",
    query = "SELECT p FROM Pnrs p WHERE p.pnrsVersion = :pnrsVersion")
})
public class Pnrs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pnrs_id", nullable = false)
    private Integer pnrsId;
    @Column(name = "pnrs_pcc", nullable = false, length = 10)
    private String pnrsPcc;
    @Column(name = "pnrs_signon", nullable = false, length = 10)
    private String pnrsSignon;
    @Column(name = "pnrs_recloc", nullable = false, length = 10)
    private String pnrsRecloc;
    @Column(name = "pnrs_created", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date pnrsCreated;
    @Column(name = "pnrs_departed", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date pnrsDeparted;
    @Column(name = "pnrs_active", nullable = false)
    private boolean pnrsActive;
    @Column(name = "pnrs_new", nullable = false)
    private boolean pnrsNew;
    @Column(name = "pnrs_count", nullable = false)
    private int pnrsCount;
    @Column(name = "pnrs_namecount", nullable = false)
    private int pnrsNameCount;
    @Column(name = "pnrs_waitcount", nullable = false)
    private int pnrsWaitcount;
    @Version
    @Column(name = "pnrs_version", nullable = false)
    private int pnrsVersion;

    public Pnrs() {
    }

    public Integer getPnrsId() {
        return pnrsId;
    }

    public void setPnrsId(Integer pnrsId) {
        this.pnrsId = pnrsId;
    }

    public String getPnrsPcc() {
        return pnrsPcc;
    }

    public void setPnrsPcc(String pnrsPcc) {
        this.pnrsPcc = pnrsPcc;
    }

    public String getPnrsSignon() {
        return pnrsSignon;
    }

    public void setPnrsSignon(String pnrsSignon) {
        this.pnrsSignon = pnrsSignon;
    }

    public String getPnrsRecloc() {
        return pnrsRecloc;
    }

    public void setPnrsRecloc(String pnrsRecloc) {
        this.pnrsRecloc = pnrsRecloc;
    }

    public Date getPnrsCreated() {
        return pnrsCreated;
    }

    public void setPnrsCreated(Date pnrsCreated) {
        this.pnrsCreated = pnrsCreated;
    }

    public Date getPnrsDeparted() {
        return pnrsDeparted;
    }

    public void setPnrsDeparted(Date pnrsDeparted) {
        this.pnrsDeparted = pnrsDeparted;
    }

    public boolean getPnrsActive() {
        return pnrsActive;
    }

    public void setPnrsActive(boolean pnrsActive) {
        this.pnrsActive = pnrsActive;
    }

    public boolean getPnrsNew() {
        return pnrsNew;
    }

    public void setPnrsNew(boolean pnrsNew) {
        this.pnrsNew = pnrsNew;
    }

    public int getPnrsCount() {
        return pnrsCount;
    }

    public void setPnrsCount(int pnrsCount) {
        this.pnrsCount = pnrsCount;
    }

    public int getPnrsNameCount() {
        return pnrsNameCount;
    }

    public void setPnrsNameCount(int pnrsNameCount) {
        this.pnrsNameCount = pnrsNameCount;
    }

    public int getPnrsWaitcount() {
        return pnrsWaitcount;
    }

    public void setPnrsWaitcount(int pnrsWaitcount) {
        this.pnrsWaitcount = pnrsWaitcount;
    }

    public int getPnrsVersion() {
        return pnrsVersion;
    }

    public void setPnrsVersion(int pnrsVersion) {
        this.pnrsVersion = pnrsVersion;
    }

}
