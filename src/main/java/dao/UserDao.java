package dao;


import pojos.Login;
import pojos.User;

public interface UserDao {

    void register(User user);

    User validateUser(Login login);
}