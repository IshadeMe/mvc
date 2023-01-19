package web.service;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.Dao;
import web.model.User;


import java.util.List;

@Service
@Transactional
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserService {

    final Dao<User, Integer> userDao;

    public UserService(Dao<User, Integer> userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUsers() {
        return userDao.getAll();
    }

    public User getUserById(int id) {
        return userDao.getById(id);
    }

    public void addUser(User user) {
        userDao.add(user);
    }

    public void deleteUserById(int id) {
        userDao.deleteById(id);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }
}
