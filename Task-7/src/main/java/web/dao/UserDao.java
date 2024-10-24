package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void createUser(User user);

    List<User> getAllUsers();

    void updateUser(User user);

    void deleteUserById(int id);

    User getUserById(int id);
}
