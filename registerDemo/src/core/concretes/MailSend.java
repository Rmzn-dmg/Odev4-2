package core.concretes;

import entity.concrete.User;

public class MailSend {
	   public static void send(User user){

		      System.out.println("Aktivasyon maili baþarý ile gönderildi: "+user.getEmail());
		    }

}
