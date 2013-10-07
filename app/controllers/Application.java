package controllers;

import play.*;
import play.data.validation.Email;
import play.data.validation.Required;
import play.mvc.*;

import java.util.*;

public class Application extends Controller {

    public static void index(Boolean header,String tab) {
        //if(tab==null){
        //    renderTemplate("/Application/welcome.html");
        //}

        if(request.headers.get("user-agent")!= null){
            String agentInfo = request.headers.get("user-agent").toString().toLowerCase();
            Boolean isMobile = agentInfo.contains("iphone")|| agentInfo.contains("ipad")|| agentInfo.contains("android")|| agentInfo.contains("rim")|| agentInfo.contains("nokia")|| agentInfo.contains("htc");
            if(isMobile){
                renderTemplate("/Application/mobile.html");
            }
        };
        render(header,tab);
    }

    public static void mobile() {
        render();
    }

    public static void twitter() {
        render();
    }
    
    public static void sendMessage(@Required String firstname, @Required String lastname, @Required String email, String phone, @Required String message){
    	
        if (validation.hasErrors()) {
            validation.keep();
            params.flash();
            flash.error("Bazı alanları boş bıraktın?");
            index(true,"iletisim");            
        }   	
    	try {
			Mails.sendFeedbackMail(firstname, lastname, email, phone, message);
			flash.success("Mesajın gönderildi");
			index(true,"");
		} catch (Exception e) {
			e.printStackTrace();
		}    	
    	
    }

}