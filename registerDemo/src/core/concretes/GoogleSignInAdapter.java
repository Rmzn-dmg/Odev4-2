package core.concretes;

import java.util.List;

import core.abstracts.SignInService;
import google.GoogleSignIn;

public class GoogleSignInAdapter implements SignInService {


    @Override
    public List<String> signInWithOthers(String email) {
        GoogleSignIn googleSignIn = new GoogleSignIn();
        return googleSignIn.signIn(email);
    }
}
