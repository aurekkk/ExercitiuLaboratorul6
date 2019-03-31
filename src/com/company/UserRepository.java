package com.company;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Optional;

public interface UserRepository{
    ArrayList<User> filterByUserType(User.UserType usertype);
    User findById(Long Id);
    ArrayList<User> useri() throws FileNotFoundException;
    User Login(Long Id, String parola);
}
