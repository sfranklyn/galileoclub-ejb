/*
 * AppServiceBean.java
 * 
 * Created on Nov 13, 2008, 10:59:04 AM
 */
package galileoclub.ejb.service;

import java.security.MessageDigest;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author Samuel Franklyn
 */
@Stateless
public class AppServiceBean implements AppServiceRemote {

    private static final Logger log = Logger.getLogger(AppServiceBean.class.getName());
    private MessageDigest messageDigest = null;

    public AppServiceBean() {
        try {
            messageDigest = MessageDigest.getInstance("SHA-512");
        } catch (Exception ex) {
            log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
        }
    }

    public String hashPassword(final String password) {
        try {
            messageDigest.reset();
            final byte[] hash = messageDigest.digest(password.getBytes());
            return getHexString(hash);
        } catch (Exception ex) {
            log.log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
            throw new RuntimeException(ex);
        }
    }

    public static String getHexString(byte[] b) throws Exception {
        String result = "";
        for (int i = 0; i < b.length; i++) {
            result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
        }
        return result;
    }
}
