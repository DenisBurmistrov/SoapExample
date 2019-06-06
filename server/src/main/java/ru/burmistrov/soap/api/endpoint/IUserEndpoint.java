package ru.burmistrov.soap.api.endpoint;

import ru.burmistrov.soap.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface IUserEndpoint {

        @WebMethod
        void removeUserById
                (@WebParam(name = "id") final String id);

        @WebMethod
        User createUser
                (@WebParam(name = "username") final String username, @WebParam(name = "password") final String password);

        @WebMethod
        User updateUserById
                (@WebParam(name = "id") final String id,
                 @WebParam(name = "username") final String name,
                 @WebParam(name = "password") final String description);

        @WebMethod
        List<User> findAllUsers();

        @WebMethod
        User findOneUserById
                (@WebParam(name = "id") final String id);

    }
