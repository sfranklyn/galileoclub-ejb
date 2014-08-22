/*
 * Points.java
 * 
 * Created on Dec 9, 2008, 4:23:03 PM
 */
package galileoclub.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @author Samuel Franklyn
 */
@Entity
@Table(name = "points")
@NamedNativeQueries({
    @NamedNativeQuery(name = "Points.deleteYearMonth",
    query = "DELETE FROM points WHERE " +
    "point_year = ? AND " +
    "point_month = ? AND " +
    "claim_id is null")
})
@NamedQueries({
    @NamedQuery(name = "Points.findAll",
    query = "SELECT p FROM Points p"),
    @NamedQuery(name = "Points.findByPointId",
    query = "SELECT p FROM Points p WHERE p.pointId = :pointId"),
    @NamedQuery(name = "Points.findByPointUserCodeAsc",
    query = "SELECT p FROM Points p WHERE p.pointUserCode = :pointUserCode " +
    "ORDER BY p.pointYear, p.pointMonth, p.pointDay"),
    @NamedQuery(name = "Points.findByPointUserCodeDsc",
    query = "SELECT p FROM Points p WHERE p.pointUserCode = :pointUserCode " +
    "ORDER BY p.pointYear DESC, p.pointMonth DESC, p.pointDay DESC"),
    @NamedQuery(name = "Points.sumByPointUserCode",
    query = "SELECT SUM(p.pointCount) FROM Points p WHERE p.pointUserCode = :pointUserCode"),
    @NamedQuery(name = "Points.selectByClaims",
    query = "SELECT p FROM Points p WHERE p.claims = :claims"),
    @NamedQuery(name = "Points.findByPointYear",
    query = "SELECT p FROM Points p WHERE p.pointYear = :pointYear"),
    @NamedQuery(name = "Points.findByPointMonth",
    query = "SELECT p FROM Points p WHERE p.pointMonth = :pointMonth"),
    @NamedQuery(name = "Points.findByPointDay",
    query = "SELECT p FROM Points p WHERE p.pointDay = :pointDay"),
    @NamedQuery(name = "Points.findByPointPcc",
    query = "SELECT p FROM Points p WHERE p.pointPcc = :pointPcc"),
    @NamedQuery(name = "Points.findByPointSignon",
    query = "SELECT p FROM Points p WHERE p.pointSignon = :pointSignon"),
    @NamedQuery(name = "Points.findByPointCount",
    query = "SELECT p FROM Points p WHERE p.pointCount = :pointCount"),
    @NamedQuery(name = "Points.selectByUserCodePccSignOnYearMonthDay",
    query = "SELECT p FROM Points p WHERE " +
    "p.pointUserCode = :pointUserCode AND " +
    "p.pointPcc = :pointPcc AND " +
    "p.pointSignon = :pointSignon AND " +
    "p.pointYear = :pointYear AND " +
    "p.pointMonth = :pointMonth AND " +
    "p.pointDay = :pointDay")
})
public class Points implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "point_id", nullable = false)
    private Integer pointId;
    @Basic(optional = false)
    @Column(name = "point_user_code", nullable = false, length = 12)
    private String pointUserCode;
    @Basic(optional = false)
    @Column(name = "point_pcc", nullable = false, length = 10)
    private String pointPcc;
    @Basic(optional = false)
    @Column(name = "point_signon", nullable = false, length = 10)
    private String pointSignon;
    @Basic(optional = false)
    @Column(name = "point_year", nullable = false)
    private int pointYear;
    @Basic(optional = false)
    @Column(name = "point_month", nullable = false)
    private int pointMonth;
    @Basic(optional = false)
    @Column(name = "point_day", nullable = false)
    private int pointDay;
    @Basic(optional = false)
    @Column(name = "point_count", nullable = false)
    private int pointCount;
    @JoinColumn(name = "claim_id", referencedColumnName = "claim_id")
    @ManyToOne
    private Claims claims;
    @Column(name = "point_value")
    private int pointValue;

    public Points() {
    }

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public String getPointUserCode() {
        return pointUserCode;
    }

    public void setPointUserCode(String pointUserCode) {
        this.pointUserCode = pointUserCode;
    }

    public int getPointYear() {
        return pointYear;
    }

    public void setPointYear(int pointYear) {
        this.pointYear = pointYear;
    }

    public int getPointMonth() {
        return pointMonth;
    }

    public void setPointMonth(int pointMonth) {
        this.pointMonth = pointMonth;
    }

    public int getPointDay() {
        return pointDay;
    }

    public void setPointDay(int pointDay) {
        this.pointDay = pointDay;
    }

    public String getPointPcc() {
        return pointPcc;
    }

    public void setPointPcc(String pointPcc) {
        this.pointPcc = pointPcc;
    }

    public String getPointSignon() {
        return pointSignon;
    }

    public void setPointSignon(String pointSignon) {
        this.pointSignon = pointSignon;
    }

    public int getPointCount() {
        return pointCount;
    }

    public void setPointCount(int pointCount) {
        this.pointCount = pointCount;
    }

    public Claims getClaims() {
        return claims;
    }

    public void setClaims(Claims claims) {
        this.claims = claims;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pointId != null ? pointId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Points)) {
            return false;
        }
        Points other = (Points) object;
        if ((this.pointId == null && other.pointId != null) || (this.pointId != null && !this.pointId.equals(other.pointId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
