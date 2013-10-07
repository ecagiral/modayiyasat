package controllers;

import play.Logger;
import play.Play;
import play.mvc.*;

import javax.mail.internet.*;

public class Mails extends Mailer {
    
    public static void sendFeedbackMail(String firstname, String lastname, String email, String phone,String feedback) throws Exception {
        setFrom(new InternetAddress("info@modayiyasat.com", "modayiyasat"));        
        setSubject("Yeni mesaj var");
        addRecipient("pr.turkey@hm.com");
        send(firstname,lastname,feedback,email,phone);
    }
    
}

