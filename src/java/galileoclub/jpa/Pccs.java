/*
 * Pccs.java
 * 
 * Created on Nov 12, 2008, 11:06:20 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import javax.persistence.*;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 *
 * @author Samuel Franklyn
 */
@Entity
@Table(name = "pccs")
@NamedQueries({
    @NamedQuery(name = "Pccs.selectAll",
    query = "SELECT p FROM Pccs p ORDER BY p.pccsPcc"),
    @NamedQuery(name = "Pccs.selectAllCount",
    query = "SELECT COUNT(p) FROM Pccs p"),
    @NamedQuery(name = "Pccs.findByPccsId",
    query = "SELECT p FROM Pccs p WHERE p.pccsId = :pccsId"),
    @NamedQuery(name = "Pccs.findByPccsPcc",
    query = "SELECT p FROM Pccs p WHERE p.pccsPcc = :pccsPcc"),
    @NamedQuery(name = "Pccs.findByPccsPccCount",
    query = "SELECT COUNT(p) FROM Pccs p WHERE p.pccsPcc = :pccsPcc"),
    @NamedQuery(name = "Pccs.findByPccsDesc",
    query = "SELECT p FROM Pccs p WHERE p.pccsDesc = :pccsDesc"),
    @NamedQuery(name = "Pccs.findByPccsVersion",
    query = "SELECT p FROM Pccs p WHERE p.pccsVersion = :pccsVersion")
})
public class Pccs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pccs_id", nullable = false)
    private Integer pccsId;
    @Column(name = "pccs_pcc", nullable = false, length = 10)
    private String pccsPcc;
    @Column(name = "pccs_desc", nullable = false, length = 200)
    private String pccsDesc;
    @Lob
    @Column(name = "pccs_note", length = 16777215)
    private String pccsNote;
    @Version
    @Column(name = "pccs_version", nullable = false)
    private int pccsVersion;

    public Pccs() {
    }

    public Integer getPccsId() {
        return pccsId;
    }

    public void setPccsId(Integer pccsId) {
        this.pccsId = pccsId;
    }

    public String getPccsPcc() {
        return pccsPcc;
    }

    public void setPccsPcc(String pccsPcc) {
        this.pccsPcc = pccsPcc;
    }

    public String getPccsDesc() {
        return pccsDesc;
    }

    public void setPccsDesc(String pccsDesc) {
        this.pccsDesc = pccsDesc;
    }

    public String getPccsNote() {
        return pccsNote;
    }

    public void setPccsNote(String pccsNote) {
        this.pccsNote = pccsNote;
    }

    public int getPccsVersion() {
        return pccsVersion;
    }

    public void setPccsVersion(int pccsVersion) {
        this.pccsVersion = pccsVersion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pccsId != null ? pccsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Pccs)) {
            return false;
        }
        Pccs other = (Pccs) object;
        if ((this.pccsId == null && other.pccsId != null) || (this.pccsId != null && !this.pccsId.equals(other.pccsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
