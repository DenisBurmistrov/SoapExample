package ru.burmistrov.soap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.burmistrov.soap.api.endpoint.User;
import ru.burmistrov.soap.configuration.SpringConfiguration;
import ru.burmistrov.soap.service.UserService;

import java.util.List;

public class ApplicationClient {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = context.getBean(UserService.class);

        User user = userService.persist("test", "test");
        userService.persist("admin", "admin");
        System.out.println("PERSIST: " + user.getId() + " " + user.getUsername() + " " + user.getPassword());

        List<User> users = userService.findAllUsers();
        System.out.println("GET ALL: ");
        for (User user1 : users) {
            System.out.println(user1.getId() + " " + user1.getUsername() + " " + user1.getPassword());
        }

        userService.merge(user.getId(), "test merge", "test merge");
        User mergedUser = userService.findOneById(user.getId());
        System.out.println("MERGE: " + mergedUser.getId() + " " + mergedUser.getUsername() + " " + mergedUser.getPassword());

        userService.removeById(user.getId());
        List<User> usersAfterDelete = userService.findAllUsers();
        System.out.println("GET ALL AFTER DELETE: ");
        for (User user1 : usersAfterDelete) {
            System.out.println(user1.getId() + " " + user1.getUsername() + " " + user1.getPassword());
        }
    }
}
