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

}
