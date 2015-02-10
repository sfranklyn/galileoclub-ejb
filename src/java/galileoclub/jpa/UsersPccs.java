/*
 * UsersPccs.java
 * 
 * Created on Sep 25, 2014, 9:38:23 AM
 */
package galileoclub.jpa;

import java.io.Serializable;
import javax.persistence.*;

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
    @Basic(optional = false)
    @Column(name = "user_pcc_version", nullable = false)
    private int userPccVersion;
    @JoinColumn(name = "pccs_id", referencedColumnName = "pccs_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pccs pccs;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Users users;

    public UsersPccs() {
    }

    public UsersPccs(UsersPccsPK usersPccsPK) {
        this.usersPccsPK = usersPccsPK;
    }

    public UsersPccs(UsersPccsPK usersPccsPK, int userPccVersion) {
        this.usersPccsPK = usersPccsPK;
        this.userPccVersion = userPccVersion;
    }

    public UsersPccs(int userId, int pccsId, String userPccSon) {
        this.usersPccsPK = new UsersPccsPK(userId, pccsId, userPccSon);
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

    public Pccs getPccs() {
        return pccs;
    }

    public void setPccs(Pccs pccs) {
        this.pccs = pccs;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

}
