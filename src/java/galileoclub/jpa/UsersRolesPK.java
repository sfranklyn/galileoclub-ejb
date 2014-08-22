/*
 * UsersRolesPK.java
 * 
 * Created on Oct 15, 2008, 10:51:09 AM
 */

package galileoclub.jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @author Samuel Franklyn
 */
@Embeddable
public class UsersRolesPK implements Serializable {
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Column(name = "role_id", nullable = false)
    private int roleId;

    public UsersRolesPK() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) userId;
        hash += (int) roleId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UsersRolesPK)) {
            return false;
        }
        UsersRolesPK other = (UsersRolesPK) object;
        if (this.userId != other.userId) {
            return false;
        }
        if (this.roleId != other.roleId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
    }

}
