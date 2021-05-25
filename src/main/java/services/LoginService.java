package services;

import pojos.Login;
import pojos.User;

public interface LoginService {
    void register(User user);

    User validateUser(Login login);
}
