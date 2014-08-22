/*
 * UsersRoles.java
 * 
 * Created on Oct 15, 2008, 10:51:09 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
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
@Table(name = "users_roles")
@NamedQueries({
    @NamedQuery(name = "UsersRoles.selectAll",
    query = "SELECT u FROM UsersRoles u ORDER BY u.roles.roleName,u.users.userName"),
    @NamedQuery(name = "UsersRoles.selectAllCount",
    query = "SELECT COUNT(u) FROM UsersRoles u"),
    @NamedQuery(name = "UsersRoles.findByUserId",
    query = "SELECT u FROM UsersRoles u WHERE u.usersRolesPK.userId = :userId"),
    @NamedQuery(name = "UsersRoles.findByRoleId",
    query = "SELECT u FROM UsersRoles u WHERE u.usersRolesPK.roleId = :roleId"),
    @NamedQuery(name = "UsersRoles.findByUsersRolesDesc",
    query = "SELECT u FROM UsersRoles u WHERE u.usersRolesDesc = :usersRolesDesc")
})
public class UsersRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsersRolesPK usersRolesPK;
    @Column(name = "users_roles_desc", length = 100)
    private String usersRolesDesc;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    @ManyToOne
    private Users users;
    @JoinColumn(name = "role_id", referencedColumnName = "role_id", insertable = false, updatable = false)
    @ManyToOne
    private Roles roles;
    @Version
    @Column(name = "users_roles_version", nullable = false)
    private Integer usersRolesVersion;

    public UsersRoles() {
    }

    public UsersRolesPK getUsersRolesPK() {
        return usersRolesPK;
    }

    public void setUsersRolesPK(UsersRolesPK usersRolesPK) {
        this.usersRolesPK = usersRolesPK;
    }

    public String getUsersRolesDesc() {
        return usersRolesDesc;
    }

    public void setUsersRolesDesc(String usersRolesDesc) {
        this.usersRolesDesc = usersRolesDesc;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Integer getUsersRolesVersion() {
        return usersRolesVersion;
    }

    public void setUsersRolesVersion(Integer usersRolesVersion) {
        this.usersRolesVersion = usersRolesVersion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersRolesPK != null ? usersRolesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UsersRoles)) {
            return false;
        }
        UsersRoles other = (UsersRoles) object;
        if ((this.usersRolesPK == null && other.usersRolesPK != null) || (this.usersRolesPK != null && !this.usersRolesPK.equals(other.usersRolesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
