package Email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


class SimpleMail {

	public static void main(String[] args) throws Exception{
    	
    System.out.println("start");
    final String username="ksthakur93@gmail.com";
    final String password="allizwell11";	
 
      
      // Recipient's email ID needs to be mentioned.
      String to = "ka7777777777777772@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "ksthakur93@gmail.com";
  
      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");
      String dsn = "SUCCESS,FAILURE,DELAY ORCPT=rfc822; karansingh7112@gmail.com";
      props.put("mail.smtp.dsn.notify", dsn);
      props.put("mail.smtp.from", "karan.singh@digispice.com");


      // Get the Session object.
      Session session = Session.getInstance(props,
         new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(username, password);
	   }
         });

      try {
	   // Create a default MimeMessage object.
	   Message message = new MimeMessage(session);
	
	   // Set From: header field of the header.
	   message.setFrom(new InternetAddress(from));
	
	   message.setHeader("Disposition-Notification-To", "karansingh7112@gmail.com");
	    //  message.setHeader("Return-Receipt-To", "karan.singh@digispice.com");

	   // Set To: header field of the header.
	   message.setRecipients(Message.RecipientType.TO,
               InternetAddress.parse(to));
	
	   // Set Subject: header field
	   message.setSubject("Testing Subject");
	
	   // Now set the actual message
	   message.setText("Hello, this is sample for to check send " +
		"email using JavaMailAPI ");

	   // Send message
	   Transport.send(message);

	   System.out.println("Sent message successfully....");

      } catch (MessagingException e) {
         throw new RuntimeException(e);
      }
   

      System.out.println("Done.");
    }
}