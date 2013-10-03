package controllers;

import play.Logger;
import play.Play;
import play.mvc.*;

import javax.mail.internet.*;

public class Mails extends Mailer {
    
    public static void sendFeedbackMail(String firstname, String lastname, String email, String phone,String feedback) throws Exception {
        setFrom(new InternetAddress("info@yolyola.com", "modayiyasat"));        
        setSubject("Yeni mesaj var");
        addRecipient("nerds@hep.com.tr");
        //pr.turkiye@hm.com
        send(firstname,lastname,feedback,email,phone);
    }
    
}

