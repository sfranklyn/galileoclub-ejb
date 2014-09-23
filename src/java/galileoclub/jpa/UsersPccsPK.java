/*
 * UsersPccsPK.java
 * 
 * Created on Sep 8, 2014, 9:07:54 AM
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

    public UsersPccsPK() {
    }

    public UsersPccsPK(int userId, int pccsId) {
        this.userId = userId;
        this.pccsId = pccsId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) userId;
        hash += (int) pccsId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
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
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
    }

}
