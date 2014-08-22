/*
 * UrlsRoles.java
 * 
 * Created on Oct 15, 2008, 10:51:09 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "urls_roles")
@NamedQueries({
    @NamedQuery(name = "UrlsRoles.selectAll",
    query = "SELECT u FROM UrlsRoles u ORDER BY u.roles.roleName,u.urlsRolesPK.urlRole"),
    @NamedQuery(name = "UrlsRoles.selectAllCount",
    query = "SELECT COUNT(u) FROM UrlsRoles u"),
    @NamedQuery(name = "UrlsRoles.findByUrlRole",
    query = "SELECT u FROM UrlsRoles u WHERE u.urlsRolesPK.urlRole = :urlRole"),
    @NamedQuery(name = "UrlsRoles.findByRoleId",
    query = "SELECT u FROM UrlsRoles u WHERE u.urlsRolesPK.roleId = :roleId")
})
public class UrlsRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UrlsRolesPK urlsRolesPK;
    @JoinColumn(name = "role_id", referencedColumnName = "role_id",  nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Roles roles;
    @Version
    @Basic(optional = false)
    @Column(name = "url_role_version", nullable = false)
    private Integer urlRoleVersion;

    public UrlsRoles() {
    }

    public UrlsRolesPK getUrlsRolesPK() {
        return urlsRolesPK;
    }

    public void setUrlsRolesPK(UrlsRolesPK urlsRolesPK) {
        this.urlsRolesPK = urlsRolesPK;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Integer getUrlRoleVersion() {
        return urlRoleVersion;
    }

    public void setUrlRoleVersion(Integer urlRoleVersion) {
        this.urlRoleVersion = urlRoleVersion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (urlsRolesPK != null ? urlsRolesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UrlsRoles)) {
            return false;
        }
        UrlsRoles other = (UrlsRoles) object;
        if ((this.urlsRolesPK == null && other.urlsRolesPK != null) || (this.urlsRolesPK != null && !this.urlsRolesPK.equals(other.urlsRolesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
    }
}
