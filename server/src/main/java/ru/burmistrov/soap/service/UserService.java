package ru.burmistrov.soap.service;

import org.springframework.stereotype.Service;
import ru.burmistrov.soap.api.service.IUserService;
import ru.burmistrov.soap.entity.User;
import ru.burmistrov.soap.repository.IUserRepository;

import java.util.List;

@Service
public class UserService implements IUserService {

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAllUsers();
    }

    public User findOneById(String id) {
        return userRepository.findOne(id);
    }

    public User persist(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userRepository.save(user);
    }

    public User merge(String id, String username, String password) {
        User user = userRepository.findOne(id);
        if(user != null) {
            user.setUsername(username);
            user.setPassword(password);
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteById(String id) {
        User user = userRepository.findOne(id);
        if(user != null) {
            userRepository.delete(user);
        }
    }
}
