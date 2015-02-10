/*
 * UsersRolesPK.java
 * 
 * Created on Oct 15, 2008, 10:51:09 AM
 */

package galileoclub.jpa;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

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

}
