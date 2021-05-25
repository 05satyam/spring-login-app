package services.serviceImpl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import pojos.Login;
import pojos.User;
import services.LoginService;

public class LoginServiceImpl implements LoginService {

    @Autowired
    UserDao userDao;


    @Override
    public void register(User user) {
        userDao.register(user);
    }

    @Override
    public User validateUser(Login login) {
        return userDao.validateUser(login);
    }
}
