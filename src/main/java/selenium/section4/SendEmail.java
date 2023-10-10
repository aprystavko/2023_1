package selenium.section4;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail {
    Password ps = new Password();
    Properties properties = System.getProperties();
    String to;
    String from;
    String emailSubject;
    String emailText;

    {
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
    }

    public SendEmail(String to, String emailSubject, String emailText) throws MessagingException {
        this.to = to;
        this.from = ps.getEMAIL();
        this.emailSubject = emailSubject;
        this.emailText = emailText;
    }

    Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(ps.getEMAIL(), ps.getPASSWORD());
        }
    });

    public void sendEmail() {
        session.setDebug(true);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(emailSubject);
            message.setText(emailText);
            System.out.println("sending...");
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

}