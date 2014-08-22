/*
 * SegmentCounterServiceRemote.java
 * 
 * Created on Nov 27, 2008, 4:12:39 PM
 */
package galileoclub.ejb.service;

import javax.ejb.Remote;

/**
 *
 * @author Samuel Franklyn
 */
@Remote
public interface SegmentCounterServiceRemote {

    void countSegment();

    void transferToPoint(String yearMonth);
}
