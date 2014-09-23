/*
 * UsersPccs.java
 * 
 * Created on Sep 8, 2014, 9:07:54 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import javax.persistence.*;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 *
 * @author Samuel Franklyn
 */
@Entity
@Table(name = "users_pccs")
@NamedQueries({
    @NamedQuery(name = "UsersPccs.selectAll",
    query = "SELECT u FROM UsersPccs u"),
    @NamedQuery(name = "UsersPccs.selectAllCount",
    query = "SELECT COUNT(u) FROM UsersPccs u"),
    @NamedQuery(name = "UsersPccs.selectByUser",
    query = "SELECT u FROM UsersPccs u WHERE u.users = :users"),
    @NamedQuery(name = "UsersPccs.selectByUserCount",
    query = "SELECT COUNT(u) FROM UsersPccs u WHERE u.users = :users")
})
public class UsersPccs implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsersPccsPK usersPccsPK;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id",
    nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Users users;
    @JoinColumn(name = "pccs_id", referencedColumnName = "pccs_id",
    nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pccs pccs;
    @Column(name = "user_pcc_son", nullable = false, length = 10)
    private String userPccSon;
    @Version
    @Basic(optional = false)
    @Column(name = "user_pcc_version", nullable = false)
    private int userPccVersion;

    public UsersPccs() {
    }

    public UsersPccs(UsersPccsPK usersPccsPK) {
        this.usersPccsPK = usersPccsPK;
    }

    public UsersPccs(UsersPccsPK usersPccsPK, int userPccVersion) {
        this.usersPccsPK = usersPccsPK;
        this.userPccVersion = userPccVersion;
    }

    public UsersPccs(int userId, int pccsId) {
        this.usersPccsPK = new UsersPccsPK(userId, pccsId);
    }

    public UsersPccsPK getUsersPccsPK() {
        return usersPccsPK;
    }

    public void setUsersPccsPK(UsersPccsPK usersPccsPK) {
        this.usersPccsPK = usersPccsPK;
    }

    public int getUserPccVersion() {
        return userPccVersion;
    }

    public void setUserPccVersion(int userPccVersion) {
        this.userPccVersion = userPccVersion;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Pccs getPccs() {
        return pccs;
    }

    public void setPccs(Pccs pccs) {
        this.pccs = pccs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersPccsPK != null ? usersPccsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof UsersPccs)) {
            return false;
        }
        UsersPccs other = (UsersPccs) object;
        if ((this.usersPccsPK == null && other.usersPccsPK != null) || (this.usersPccsPK != null && !this.usersPccsPK.equals(other.usersPccsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    public String getUserPccSon() {
        return userPccSon;
    }

    public void setUserPccSon(String userPccSon) {
        this.userPccSon = userPccSon;
    }
}
