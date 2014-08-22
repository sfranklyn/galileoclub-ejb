/*
 * Roles.java
 * 
 * Created on Oct 15, 2008, 10:51:09 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @author Samuel Franklyn
 */
@Entity
@Table(name = "roles")
@NamedQueries({
    @NamedQuery(name = "Roles.isAdminByUserName",
    query = "SELECT r " +
    "FROM Roles r, Users u, UsersRoles ur " +
    "WHERE " +
    "r = ur.roles AND " +
    "u = ur.users AND " +
    "u.userName = :userName AND " +
    "r.roleName = 'ADM'"),
    @NamedQuery(name = "Roles.selectMenuByUserName",
    query = "SELECT r.roleMenu " +
    "FROM Roles r, Users u, UsersRoles ur " +
    "WHERE " +
    "r = ur.roles AND " +
    "u = ur.users AND " +
    "u.userName = :userName"),
    @NamedQuery(name = "Roles.selectAll",
    query = "SELECT r FROM Roles r"),
    @NamedQuery(name = "Roles.selectAllCount",
    query = "SELECT COUNT(r) FROM Roles r"),
    @NamedQuery(name = "Roles.findByRoleId",
    query = "SELECT r FROM Roles r WHERE r.roleId = :roleId"),
    @NamedQuery(name = "Roles.findByRoleName",
    query = "SELECT r FROM Roles r WHERE r.roleName = :roleName"),
    @NamedQuery(name = "Roles.findByRoleDesc",
    query = "SELECT r FROM Roles r WHERE r.roleDesc = :roleDesc"),
    @NamedQuery(name = "Roles.findByRoleMenu",
    query = "SELECT r FROM Roles r WHERE r.roleMenu = :roleMenu")
})
public class Roles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = false)
    private Integer roleId;
    @Column(name = "role_name", nullable = false, length = 50)
    private String roleName;
    @Column(name = "role_desc", nullable = false, length = 100)
    private String roleDesc;
    @Column(name = "role_menu", nullable = false, length = 50)
    private String roleMenu;
    @Version
    @Column(name = "role_version", nullable = false)
    private Integer roleVersion;

    public Roles() {
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getRoleMenu() {
        return roleMenu;
    }

    public void setRoleMenu(String roleMenu) {
        this.roleMenu = roleMenu;
    }

    public Integer getRoleVersion() {
        return roleVersion;
    }

    public void setRoleVersion(Integer roleVersion) {
        this.roleVersion = roleVersion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleId != null ? roleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Roles)) {
            return false;
        }
        Roles other = (Roles) object;
        if ((this.roleId == null && other.roleId != null) || (this.roleId != null && !this.roleId.equals(other.roleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
    }
}
