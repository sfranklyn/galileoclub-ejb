/*
 * Configs.java
 * 
 * Created on Nov 21, 2008, 11:10:53 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @author Samuel Franklyn
 */
@Entity
@Table(name = "configs")
@NamedQueries({
    @NamedQuery(name = "Configs.selectAll",
    query = "SELECT c FROM Configs c"),
    @NamedQuery(name = "Configs.selectAllCount",
    query = "SELECT COUNT(c) FROM Configs c"),
    @NamedQuery(name = "Configs.findByConfigId",
    query = "SELECT c FROM Configs c WHERE c.configId = :configId"),
    @NamedQuery(name = "Configs.findByConfigKey",
    query = "SELECT c FROM Configs c WHERE c.configKey = :configKey"),
    @NamedQuery(name = "Configs.findByConfigDesc",
    query = "SELECT c FROM Configs c WHERE c.configDesc = :configDesc"),
    @NamedQuery(name = "Configs.findByConfigType",
    query = "SELECT c FROM Configs c WHERE c.configType = :configType"),
    @NamedQuery(name = "Configs.findByConfigValue",
    query = "SELECT c FROM Configs c WHERE c.configValue = :configValue"),
    @NamedQuery(name = "Configs.findByConfigVersion",
    query = "SELECT c FROM Configs c WHERE c.configVersion = :configVersion")
})
public class Configs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "config_id", nullable = false)
    private Integer configId;
    @Column(name = "config_key", nullable = false, length = 30)
    private String configKey;
    @Column(name = "config_desc", nullable = false, length = 100)
    private String configDesc;
    @Column(name = "config_type", nullable = false, length = 100)
    private String configType;
    @Column(name = "config_value", nullable = false, length = 100)
    private String configValue;
    @Column(name = "config_version", nullable = false)
    @Version
    private int configVersion;

    public Configs() {
    }

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public String getConfigDesc() {
        return configDesc;
    }

    public void setConfigDesc(String configDesc) {
        this.configDesc = configDesc;
    }

    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public int getConfigVersion() {
        return configVersion;
    }

    public void setConfigVersion(int configVersion) {
        this.configVersion = configVersion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (configId != null ? configId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Configs)) {
            return false;
        }
        Configs other = (Configs) object;
        if ((this.configId == null && other.configId != null) || (this.configId != null && !this.configId.equals(other.configId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
    }
}
