package business.abstracts;

import entity.concrete.User;
public interface UserService {
	void singUp(User user) ;
    void singIn(String email,String password) ;
    void SignUpWithGoogle(String email) ;
    void SignInWithGoogle(String email) ;


}
