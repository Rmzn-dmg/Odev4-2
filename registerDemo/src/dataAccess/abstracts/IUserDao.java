package dataAccess.abstracts;

import java.util.ArrayList;

import entity.concrete.User;

public interface IUserDao {
    void add(User user);

    boolean isEmailExist(User user);

    ArrayList<User> getAll();
}


