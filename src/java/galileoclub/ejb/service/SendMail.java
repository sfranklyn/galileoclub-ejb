/*
 * SendMail.java
 * 
 * Created on Mar 19, 2009, 9:52:28 AM
 */
package galileoclub.ejb.service;

import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Samuel Franklyn
 */
public class SendMail implements Runnable {

    private String subject;
    private String body;
    private String sender;
    private String recipients;

    public SendMail(String subject,
            String body, String sender, String recipients) {
        this.subject = subject;
        this.body = body;
        this.sender = sender;
        this.recipients = recipients;
    }

    public void run() {
        try {
            Session session;
            Properties mailProperties = new Properties();
            mailProperties.setProperty("mail.smtp.port", "25");
            mailProperties.setProperty("mail.transport.protocol", "smtp");
            mailProperties.setProperty("mail.smtp.auth", "false");
            mailProperties.setProperty("mail.host", "smtp.masolusi.net");
            session = Session.getInstance(mailProperties);
            MimeMessage message = new MimeMessage(session);
            message.setSender(new InternetAddress(sender));
            message.setFrom(new InternetAddress(sender));
            message.setSubject(subject);
            message.setContent(body, "text/plain");
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipients));
            message.setSentDate(new Date());
            Transport.send(message);
        } catch (Exception ex) {
            Logger.getLogger(SendMail.class.getName()).log(Level.SEVERE, "GCLUB0001:" + ex.toString(), ex);
        }
    }
}
