/*
 * Pnrcounts.java
 * 
 * Created on Nov 12, 2008, 11:06:20 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
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
@Table(name = "pnrcounts")
@NamedNativeQueries({
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByYearMonth",
    query = "select "
    + "pnrcounts_yearmonth,"
    + "sum(pnrcounts_count),"
    + "sum(pnrcounts_waitcount),"
    + "sum(pnrcounts_namecount) "
    + "from pnrcounts "
    + "group by "
    + "pnrcounts_yearmonth "
    + "order by pnrcounts_yearmonth"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByYearMonthDsc",
    query = "select "
    + "pnrcounts_yearmonth,"
    + "sum(pnrcounts_count),"
    + "sum(pnrcounts_waitcount),"
    + "sum(pnrcounts_namecount) "
    + "from pnrcounts "
    + "group by "
    + "pnrcounts_yearmonth "
    + "order by pnrcounts_yearmonth desc"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPccYearMonth",
    query = "select "
    + "pnrcounts_pcc,"
    + "pccs_desc,"
    + "pnrcounts_yearmonth,"
    + "sum(pnrcounts_count),"
    + "sum(pnrcounts_namecount), "
    + "sum(pnrcounts_waitcount) "
    + "from pnrcounts "
    + "left join pccs on "
    + "pnrcounts_pcc=pccs_pcc "
    + "where "
    + "pnrcounts_pcc=#pnrcountsPcc "
    + "group by "
    + "pnrcounts_pcc, "
    + "pnrcounts_yearmonth "
    + "order by pnrcounts_yearmonth"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPccYearMonthDsc",
    query = "select "
    + "pnrcounts_pcc,"
    + "pccs_desc,"
    + "pnrcounts_yearmonth,"
    + "sum(pnrcounts_count),"
    + "sum(pnrcounts_namecount), "
    + "sum(pnrcounts_waitcount) "
    + "from pnrcounts "
    + "left join pccs on "
    + "pnrcounts_pcc=pccs_pcc "
    + "where "
    + "pnrcounts_pcc=#pnrcountsPcc "
    + "group by "
    + "pnrcounts_pcc, "
    + "pnrcounts_yearmonth "
    + "order by pnrcounts_yearmonth desc"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByYearMonthCount",
    query = "select count(*) from ("
    + "select count(*) from pnrcounts "
    + "group by "
    + "pnrcounts_yearmonth) pnrcounts"),
    @NamedNativeQuery(name = "Pnrcounts.sumByDate",
    query = "select sum(pnrcounts_count) from pnrcounts "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd"),
    @NamedNativeQuery(name = "Pnrcounts.sumNameByDate",
    query = "select sum(pnrcounts_namecount) from pnrcounts "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd"),
    @NamedNativeQuery(name = "Pnrcounts.sumWaitByDate",
    query = "select sum(pnrcounts_waitcount) from pnrcounts "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd"),
    @NamedNativeQuery(name = "Pnrcounts.sumByDatePlus",
    query = "select sum(pnrcounts_count) from pnrcounts "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd and "
    + "pnrcounts_count>=0"),
    @NamedNativeQuery(name = "Pnrcounts.sumByDateMinus",
    query = "select sum(pnrcounts_count) from pnrcounts "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd and "
    + "pnrcounts_count<0"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPcc",
    query = "select "
    + "pnrcounts_pcc,"
    + "pccs_desc,"
    + "sum(pnrcounts_count) as pnrcounts_count,"
    + "sum(pnrcounts_waitcount), "
    + "sum(pnrcounts_namecount) "
    + "from pnrcounts "
    + "left join pccs on "
    + "pnrcounts_pcc=pccs_pcc "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd "
    + "group by "
    + "pnrcounts_pcc "
    + "order by pnrcounts_count desc"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupAllByPcc",
    query = "select "
    + "pnrcounts_pcc,"
    + "pccs_desc,"
    + "sum(pnrcounts_count) as pnrcounts_count,"
    + "sum(pnrcounts_waitcount), "
    + "sum(pnrcounts_namecount) "
    + "from pnrcounts "
    + "left join pccs on "
    + "pnrcounts_pcc=pccs_pcc "
    + "group by "
    + "pnrcounts_pcc "
    + "order by pnrcounts_count desc"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPccFind",
    query = "select "
    + "pnrcounts_pcc,"
    + "pccs_desc,"
    + "sum(pnrcounts_count) as pnrcounts_count,"
    + "sum(pnrcounts_waitcount), "
    + "sum(pnrcounts_namecount) "
    + "from pnrcounts "
    + "left join pccs on "
    + "pnrcounts_pcc=pccs_pcc "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd and "
    + "pnrcounts_pcc=#pnrcountsPcc "
    + "group by "
    + "pnrcounts_pcc "
    + "order by pnrcounts_count desc"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPccFind2",
    query = "select "
    + "pnrcounts_pcc,"
    + "pccs_desc,"
    + "sum(pnrcounts_count) as pnrcounts_count,"
    + "sum(pnrcounts_waitcount), "
    + "sum(pnrcounts_namecount) "
    + "from pnrcounts "
    + "left join pccs on "
    + "pnrcounts_pcc=pccs_pcc "
    + "where "
    + "pnrcounts_pcc=#pnrcountsPcc "
    + "group by "
    + "pnrcounts_pcc "
    + "order by pnrcounts_count desc"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPccDescFind",
    query = "select "
    + "pnrcounts_pcc,"
    + "pccs_desc,"
    + "sum(pnrcounts_count) as pnrcounts_count,"
    + "sum(pnrcounts_waitcount), "
    + "sum(pnrcounts_namecount) "
    + "from pnrcounts "
    + "left join pccs on "
    + "pnrcounts_pcc=pccs_pcc "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd and "
    + "pccs_desc like #pnrCountsPccDesc "
    + "group by "
    + "pnrcounts_pcc "
    + "order by pnrcounts_count desc"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPccDescFind2",
    query = "select "
    + "pnrcounts_pcc,"
    + "pccs_desc,"
    + "sum(pnrcounts_count) as pnrcounts_count,"
    + "sum(pnrcounts_waitcount), "
    + "sum(pnrcounts_namecount) "
    + "from pnrcounts "
    + "left join pccs on "
    + "pnrcounts_pcc=pccs_pcc "
    + "where "
    + "pccs_desc like #pnrCountsPccDesc "
    + "group by "
    + "pnrcounts_pcc "
    + "order by pnrcounts_count desc"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPccCount",
    query = "select count(*) from ("
    + "select count(*) from pnrcounts "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd "
    + "group by "
    + "pnrcounts_pcc "
    + ") pnrcounts"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPccSignOn",
    query = "select "
    + "pnrcounts_pcc,"
    + "pccs_desc,"
    + "pnrcounts_signon,"
    + "sum(pnrcounts_count) as pnrcounts_count,"
    + "sum(pnrcounts_waitcount) as pnrcounts_waitcount,"
    + "sum(pnrcounts_namecount) as pnrcounts_namecount "
    + "from pnrcounts "
    + "left join pccs on "
    + "pnrcounts_pcc=pccs_pcc "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd and "
    + "pnrcounts_pcc=#pnrcountsPcc "
    + "group by "
    + "pnrcounts_pcc,"
    + "pnrcounts_signon "
    + "order by pnrcounts_count desc"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPccSignOnCount",
    query = "select count(*) from ( "
    + "select count(*) from pnrcounts "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd and "
    + "pnrcounts_pcc=#pnrcountsPcc "
    + "group by "
    + "pnrcounts_pcc,"
    + "pnrcounts_signon "
    + ") pnrcounts"),
    @NamedNativeQuery(name = "Pnrcounts.selectByDatePccSignOn",
    query = "select "
    + "pnrcounts_created," + //0
    "pnrcounts_recloc," + //1
    "pnrcounts_countdate," + //2
    "pnrcounts_departed," + //3
    "pnrcounts_count," + //4
    "pnrcounts_waitcount," + //5
    "pnrcounts_pcc," + //6
    "pccs_desc," + //7
    "pnrcounts_signon, " + //8
    "pnrcounts_namecount " + //9
    "from pnrcounts "
    + "left join pccs on "
    + "pnrcounts_pcc=pccs_pcc "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd and "
    + "pnrcounts_pcc=#pnrcountsPcc and "
    + "pnrcounts_signon=#pnrcountsSignOn "
    + "order by "
    + "pnrcounts_created,"
    + "pnrcounts_recloc,"
    + "pnrcounts_countdate,"
    + "pnrcounts_departed"),
    @NamedNativeQuery(name = "Pnrcounts.selectByDatePccSignOnCount",
    query = "select count(*) from segcount7 "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd and "
    + "pnrcounts_pcc=#pnrcountsPcc and "
    + "pnrcounts_signon=#pnrcountsSignOn"),
    @NamedNativeQuery(name = "Pnrcounts.selectByDatePcc",
    query = "select "
    + "pnrcounts_pcc," + //1
    "pccs_desc," + //2
    "pnrcounts_signon," + //3
    "pnrcounts_created," + //4
    "pnrcounts_recloc," + //5
    "pnrcounts_countdate," + //6
    "pnrcounts_departed," + //7
    "pnrcounts_count," + //8
    "pnrcounts_waitcount," + //9
    "pnrcounts_namecount " + //10
    "from pnrcounts "
    + "left join pccs on "
    + "pnrcounts_pcc=pccs_pcc "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd and "
    + "pnrcounts_pcc=#pnrcountsPcc "
    + "order by "
    + "pnrcounts_pcc,"
    + "pnrcounts_signon, "
    + "pnrcounts_created,"
    + "pnrcounts_recloc,"
    + "pnrcounts_countdate,"
    + "pnrcounts_departed"),
    @NamedNativeQuery(name = "Pnrcounts.selectByDatePccCount",
    query = "select count(*) from segcount7 "
    + "where "
    + "pnrcounts_yearmonthday>=#pnrcountsStart and "
    + "pnrcounts_yearmonthday<=#pnrcountsEnd and "
    + "pnrcounts_pcc=#pnrcountsPcc"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPccSignOnByYearMonth",
    query = "select pnrcounts_pcc,"
    + "pnrcounts_signon,"
    + "user_code,"
    + "sum(pnrcounts_count) as pnrcounts_count,"
    + "user_point_value "
    + "from pnrcounts, users "
    + "where "
    + "user_pcc=pnrcounts_pcc and "
    + "user_son=pnrcounts_signon and "
    + "user_code is not null and "
    + "pnrcounts_yearmonth=#pnrcountsYearMonth "
    + "group by "
    + "pnrcounts_pcc, "
    + "pnrcounts_signon"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByPccSignOnByYearMonth1",
    query = "select pnrcounts_pcc,"
    + "pnrcounts_signon,"
    + "user_code,"
    + "sum(pnrcounts_count) as pnrcounts_count,"
    + "user_point_value "
    + "from pnrcounts, users, pccs, users_pccs "
    + "where "
    + "users_pccs.user_id=users.user_id and "    
    + "users_pccs.pccs_id=pccs.pccs_id and "    
    + "pccs.pccs_pcc=pnrcounts_pcc and "
    + "users_pccs.user_pcc_son=pnrcounts_signon and "
    + "user_code is not null and "
    + "pnrcounts_yearmonth=#pnrcountsYearMonth "
    + "group by "
    + "pnrcounts_pcc, "
    + "pnrcounts_signon"),
    @NamedNativeQuery(name = "Pnrcounts.selectGroupByYearMonthByPccSignOn",
    query = "select "
    + "pnrcounts_yearmonth,"
    + "sum(pnrcounts_count) as pnrcounts_count "
    + "from pnrcounts "
    + "where "
    + "pnrcounts_pcc=#pnrcountsPcc and "
    + "pnrcounts_signon=#pnrcountsSignon "
    + "group by "
    + "pnrcounts_yearmonth")
})
@NamedQueries({
    @NamedQuery(name = "Pnrcounts.selectAll",
    query = "SELECT p FROM Pnrcounts p"),
    @NamedQuery(name = "Pnrcounts.selectAllCount",
    query = "SELECT COUNT(p) FROM Pnrcounts p"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsId",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsId = :pnrcountsId"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsCountdate",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsCountdate = :pnrcountsCountdate"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsYearmonth",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsYearmonth = :pnrcountsYearmonth"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsRecloc",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsRecloc = :pnrcountsRecloc"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsPcc",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsPcc = :pnrcountsPcc"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsSignon",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsSignon = :pnrcountsSignon"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsCount",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsCount = :pnrcountsCount"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsWaitcount",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsWaitcount = :pnrcountsWaitcount"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsCreated",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsCreated = :pnrcountsCreated"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsDeparted",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsDeparted = :pnrcountsDeparted"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsYearmonthday",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsYearmonthday = :pnrcountsYearmonthday"),
    @NamedQuery(name = "Pnrcounts.findByPnrcountsVersion",
    query = "SELECT p FROM Pnrcounts p WHERE p.pnrcountsVersion = :pnrcountsVersion")
})
public class Pnrcounts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pnrcounts_id", nullable = false)
    private Integer pnrcountsId;
    @Column(name = "pnrcounts_countdate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date pnrcountsCountdate;
    @Column(name = "pnrcounts_yearmonth", nullable = false, length = 6)
    private String pnrcountsYearmonth;
    @Column(name = "pnrcounts_recloc", nullable = false, length = 10)
    private String pnrcountsRecloc;
    @Column(name = "pnrcounts_pcc", nullable = false, length = 10)
    private String pnrcountsPcc;
    @Column(name = "pnrcounts_signon", nullable = false, length = 10)
    private String pnrcountsSignon;
    @Column(name = "pnrcounts_count", nullable = false)
    private int pnrcountsCount;
    @Column(name = "pnrcounts_namecount", nullable = false)
    private int pnrcountsNameCount;
    @Column(name = "pnrcounts_waitcount", nullable = false)
    private int pnrcountsWaitcount;
    @Column(name = "pnrcounts_created", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date pnrcountsCreated;
    @Column(name = "pnrcounts_departed", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date pnrcountsDeparted;
    @Column(name = "pnrcounts_yearmonthday", nullable = false, length = 8)
    private String pnrcountsYearmonthday;
    @Version
    @Column(name = "pnrcounts_version", nullable = false)
    private int pnrcountsVersion;

    public Pnrcounts() {
    }

    public Integer getPnrcountsId() {
        return pnrcountsId;
    }

    public void setPnrcountsId(Integer pnrcountsId) {
        this.pnrcountsId = pnrcountsId;
    }

    public Date getPnrcountsCountdate() {
        return pnrcountsCountdate;
    }

    public void setPnrcountsCountdate(Date pnrcountsCountdate) {
        this.pnrcountsCountdate = pnrcountsCountdate;
    }

    public String getPnrcountsYearmonth() {
        return pnrcountsYearmonth;
    }

    public void setPnrcountsYearmonth(String pnrcountsYearmonth) {
        this.pnrcountsYearmonth = pnrcountsYearmonth;
    }

    public String getPnrcountsRecloc() {
        return pnrcountsRecloc;
    }

    public void setPnrcountsRecloc(String pnrcountsRecloc) {
        this.pnrcountsRecloc = pnrcountsRecloc;
    }

    public String getPnrcountsPcc() {
        return pnrcountsPcc;
    }

    public void setPnrcountsPcc(String pnrcountsPcc) {
        this.pnrcountsPcc = pnrcountsPcc;
    }

    public String getPnrcountsSignon() {
        return pnrcountsSignon;
    }

    public void setPnrcountsSignon(String pnrcountsSignon) {
        this.pnrcountsSignon = pnrcountsSignon;
    }

    public int getPnrcountsCount() {
        return pnrcountsCount;
    }

    public void setPnrcountsCount(int pnrcountsCount) {
        this.pnrcountsCount = pnrcountsCount;
    }

    public int getPnrcountsNameCount() {
        return pnrcountsNameCount;
    }

    public void setPnrcountsNameCount(int pnrcountsNameCount) {
        this.pnrcountsNameCount = pnrcountsNameCount;
    }

    public int getPnrcountsWaitcount() {
        return pnrcountsWaitcount;
    }

    public void setPnrcountsWaitcount(int pnrcountsWaitcount) {
        this.pnrcountsWaitcount = pnrcountsWaitcount;
    }

    public Date getPnrcountsCreated() {
        return pnrcountsCreated;
    }

    public void setPnrcountsCreated(Date pnrcountsCreated) {
        this.pnrcountsCreated = pnrcountsCreated;
    }

    public Date getPnrcountsDeparted() {
        return pnrcountsDeparted;
    }

    public void setPnrcountsDeparted(Date pnrcountsDeparted) {
        this.pnrcountsDeparted = pnrcountsDeparted;
    }

    public String getPnrcountsYearmonthday() {
        return pnrcountsYearmonthday;
    }

    public void setPnrcountsYearmonthday(String pnrcountsYearmonthday) {
        this.pnrcountsYearmonthday = pnrcountsYearmonthday;
    }

    public int getPnrcountsVersion() {
        return pnrcountsVersion;
    }

    public void setPnrcountsVersion(int pnrcountsVersion) {
        this.pnrcountsVersion = pnrcountsVersion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pnrcountsId != null ? pnrcountsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Pnrcounts)) {
            return false;
        }
        Pnrcounts other = (Pnrcounts) object;
        if ((this.pnrcountsId == null && other.pnrcountsId != null) || (this.pnrcountsId != null && !this.pnrcountsId.equals(other.pnrcountsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
