package ru.burmistrov.soap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.burmistrov.soap.api.endpoint.IUserEndpoint;
import ru.burmistrov.soap.api.endpoint.User;

import java.util.List;

@Service
public class UserService {

    private final IUserEndpoint userEndpoint;

    public UserService(IUserEndpoint userEndpoint) {
        this.userEndpoint = userEndpoint;
    }

    public List<User> findAllUsers() {
        return userEndpoint.findAllUsers();
    }

    public User findOneById(String id) {
        return userEndpoint.findOneUserById(id);
    }

    public User persist(String username, String password) {
        return userEndpoint.createUser(username, password);
    }

    public User merge(String id, String username, String password) {
        return userEndpoint.updateUserById(id, username, password);
    }

    public void removeById(String id) {
        userEndpoint.removeUserById(id);
    }
}
