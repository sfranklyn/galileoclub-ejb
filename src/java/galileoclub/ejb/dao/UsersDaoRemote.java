/*
 * UsersDaoRemote.java
 * 
 * Created on Oct 16, 2008, 2:45:47 PM
 */
package galileoclub.ejb.dao;

import java.util.List;
import java.util.Map;
import javax.ejb.Remote;
import galileoclub.jpa.Users;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface UsersDaoRemote {

    Users selectByUserName(String userName);

    List<Users> selectLikeUserName(String userName);

    Users selectByUserCode(String userCode);

    List<Users> selectByUserPccSon(String userPcc, String userSon);

    void insert(Users users);

    void delete(Integer userId);

    void update(Users users);

    List<Users> selectByUserIdUrl(Map param);

    String getNextUserCode();

    void setUserPointValue(Integer userPointValueFrom, Integer userPointValueInto);
}
