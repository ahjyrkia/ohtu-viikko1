package ohtu.services;

import ohtu.domain.User;
import java.util.ArrayList;
import java.util.List;
import ohtu.data_access.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class AuthenticationService {

    private UserDao userDao;

    public AuthenticationService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean logIn(String username, String password) {
        for (User user : userDao.listAll()) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public boolean createUser(String username, String password) {
        if (userDao.findByName(username) != null) {
            return false;
        }
        if (invalid(username, password)) {
            return false;
        }
        userDao.add(new User(username, password));
        return true;
    }

    private boolean invalid(String username, String password) {
        int count = 0;
        if (!username.matches("^([a-zA-Z]).{3,}$")) {
            return true;
        }
        count += passregexAuth(password, ".*[a-z].*", ".*[!”#$%&’()*+,./;:=?_@>-].*");
        count += passregexAuth(password, ".*[0-9].*", ".{8,}");
        return count < 3;
    }

    private int passregexAuth(String password, String regex, String regex2) {
        int count = 0;
        if (password.matches(regex)) {
            count++;
        }
        if (password.matches(regex2)) {
            count++;
        }return count;
    }
}
