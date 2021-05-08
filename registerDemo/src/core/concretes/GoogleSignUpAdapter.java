package core.concretes;

import java.util.*;

import core.abstracts.SignUpService;
import google.GoogleSignUp;

public class GoogleSignUpAdapter implements SignUpService {


    GoogleSignUp googleSignUp = new GoogleSignUp();
    @Override
    public List<String> signUpWithOthers(String email) {
       return googleSignUp.signUp(email);
    }
}
