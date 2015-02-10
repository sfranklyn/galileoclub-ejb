/*
 * UrlsRoles.java
 * 
 * Created on Oct 15, 2008, 10:51:09 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import javax.persistence.*;

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

}
