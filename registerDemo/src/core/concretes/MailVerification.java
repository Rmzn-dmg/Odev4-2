package core.concretes;

import core.abstracts.IMailVerification;
import entity.concrete.User;

public class MailVerification implements IMailVerification {




    @Override
    public void verify(User user) {
        user.setEmailValidation(true);
        System.out.println("Kayd�n�z mail aktivasyonu ile tamamland�: "+ user.getEmail());
    }


}
