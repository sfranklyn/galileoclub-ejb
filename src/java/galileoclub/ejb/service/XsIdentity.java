/*
 * WsIdentity.java
 *
 * Created on August 27, 2007, 3:26 PM
 *
 */
package galileoclub.ejb.service;

import org.apache.ecs.xml.XML;

/**
 *
 * @author Samuel Franklyn
 */
public class XsIdentity {

    private static XML idXml;

    static {
        idXml = new XML("Application");
        idXml.addElement(new XML("VendorId").addElement("FLCN"));
        idXml.addElement(new XML("VendorType").addElement("G"));
        idXml.addElement(new XML("SourceId").addElement("GNDOTS"));
        idXml.addElement(new XML("SourceType").addElement("G"));
    }

    public static String identity(final String userId, final String pseudo) {
        XML userXml = new XML("User");
        userXml.addElement(new XML("UserId").addElement(userId));
        userXml.addElement(new XML("Pseudo").addElement(pseudo));

        return idXml.toString().concat(userXml.toString());
    }
}
