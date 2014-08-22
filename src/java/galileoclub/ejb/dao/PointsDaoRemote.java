/*
 * PointsDaoRemote.java
 * 
 * Created on Dec 15, 2008, 3:43:22 PM
 */
package galileoclub.ejb.dao;

import galileoclub.jpa.Claims;
import galileoclub.jpa.Points;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface PointsDaoRemote {

    List<Points> findPointsByUserCode(String userCode, Boolean ascending);

    Long sumByPointUserCode(String userCode);

    void deleteYearMonth(Integer pointYear, Integer pointMonth);

    void insert(Points points);

    void delete(Integer pointId);

    void update(Points points);

    List<Points> selectPointsByClaims(Claims claims);

    public List<Points> selectByUserCodePccSignOnYearMonthDay(Map param);
}
