/*
 * UsersPccsPK.java
 * 
 * Created on Sep 25, 2014, 9:38:23 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @author Samuel Franklyn
 */
@Embeddable
public class UsersPccsPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "user_id", nullable = false)
    private int userId;
    @Basic(optional = false)
    @Column(name = "pccs_id", nullable = false)
    private int pccsId;
    @Basic(optional = false)
    @Column(name = "user_pcc_son", nullable = false, length = 10)
    private String userPccSon;

    public UsersPccsPK() {
    }

    public UsersPccsPK(int userId, int pccsId, String userPccSon) {
        this.userId = userId;
        this.pccsId = pccsId;
        this.userPccSon = userPccSon;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPccsId() {
        return pccsId;
    }

    public void setPccsId(int pccsId) {
        this.pccsId = pccsId;
    }

    public String getUserPccSon() {
        return userPccSon;
    }

    public void setUserPccSon(String userPccSon) {
        this.userPccSon = userPccSon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) userId;
        hash += (int) pccsId;
        hash += (userPccSon != null ? userPccSon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersPccsPK)) {
            return false;
        }
        UsersPccsPK other = (UsersPccsPK) object;
        if (this.userId != other.userId) {
            return false;
        }
        if (this.pccsId != other.pccsId) {
            return false;
        }
        if ((this.userPccSon == null && other.userPccSon != null) || (this.userPccSon != null && !this.userPccSon.equals(other.userPccSon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
    
}
