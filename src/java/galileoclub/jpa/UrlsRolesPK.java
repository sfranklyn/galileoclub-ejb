/*
 * UrlsRolesPK.java
 * 
 * Created on Oct 15, 2008, 10:51:09 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Samuel Franklyn
 */
@Embeddable
public class UrlsRolesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "url_role", nullable = false, length = 250)
    private String urlRole;
    @Basic(optional = false)
    @Column(name = "role_id", nullable = false)
    private int roleId;

    public UrlsRolesPK() {
    }

    public String getUrlRole() {
        return urlRole;
    }

    public void setUrlRole(String urlRole) {
        this.urlRole = urlRole;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

}
