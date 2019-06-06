package ru.burmistrov.soap.endpoint;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.burmistrov.soap.api.endpoint.IUserEndpoint;
import ru.burmistrov.soap.api.service.IUserService;
import ru.burmistrov.soap.entity.User;

import javax.jws.WebService;
import java.util.List;

@Service
@WebService(endpointInterface = "ru.burmistrov.soap.api.endpoint.IUserEndpoint")
@NoArgsConstructor
public class UserEndpoint implements IUserEndpoint {

    private IUserService userService;

    @Autowired
    public UserEndpoint(IUserService userService) {
        this.userService = userService;
    }

    public void removeUserById(String id) {
        userService.deleteById(id);
    }

    public User createUser(String username, String password) {
        return userService.persist(username, password);
    }

    public User updateUserById(String id, String name, String description) {
        return userService.merge(id, name, description);
    }

    public List<User> findAllUsers() {
        return userService.findAllUsers();
    }

    public User findOneUserById(String id) {
        return userService.findOneById(id);
    }
}
