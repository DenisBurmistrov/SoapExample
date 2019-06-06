
package ru.burmistrov.soap.api.endpoint;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.burmistrov.soap.api.endpoint package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateUser_QNAME = new QName("http://endpoint.api.soap.burmistrov.ru/", "createUser");
    private final static QName _CreateUserResponse_QNAME = new QName("http://endpoint.api.soap.burmistrov.ru/", "createUserResponse");
    private final static QName _FindAllUsers_QNAME = new QName("http://endpoint.api.soap.burmistrov.ru/", "findAllUsers");
    private final static QName _FindAllUsersResponse_QNAME = new QName("http://endpoint.api.soap.burmistrov.ru/", "findAllUsersResponse");
    private final static QName _FindOneUserById_QNAME = new QName("http://endpoint.api.soap.burmistrov.ru/", "findOneUserById");
    private final static QName _FindOneUserByIdResponse_QNAME = new QName("http://endpoint.api.soap.burmistrov.ru/", "findOneUserByIdResponse");
    private final static QName _RemoveUserById_QNAME = new QName("http://endpoint.api.soap.burmistrov.ru/", "removeUserById");
    private final static QName _RemoveUserByIdResponse_QNAME = new QName("http://endpoint.api.soap.burmistrov.ru/", "removeUserByIdResponse");
    private final static QName _UpdateUserById_QNAME = new QName("http://endpoint.api.soap.burmistrov.ru/", "updateUserById");
    private final static QName _UpdateUserByIdResponse_QNAME = new QName("http://endpoint.api.soap.burmistrov.ru/", "updateUserByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.burmistrov.soap.api.endpoint
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link FindAllUsers }
     * 
     */
    public FindAllUsers createFindAllUsers() {
        return new FindAllUsers();
    }

    /**
     * Create an instance of {@link FindAllUsersResponse }
     * 
     */
    public FindAllUsersResponse createFindAllUsersResponse() {
        return new FindAllUsersResponse();
    }

    /**
     * Create an instance of {@link FindOneUserById }
     * 
     */
    public FindOneUserById createFindOneUserById() {
        return new FindOneUserById();
    }

    /**
     * Create an instance of {@link FindOneUserByIdResponse }
     * 
     */
    public FindOneUserByIdResponse createFindOneUserByIdResponse() {
        return new FindOneUserByIdResponse();
    }

    /**
     * Create an instance of {@link RemoveUserById }
     * 
     */
    public RemoveUserById createRemoveUserById() {
        return new RemoveUserById();
    }

    /**
     * Create an instance of {@link RemoveUserByIdResponse }
     * 
     */
    public RemoveUserByIdResponse createRemoveUserByIdResponse() {
        return new RemoveUserByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateUserById }
     * 
     */
    public UpdateUserById createUpdateUserById() {
        return new UpdateUserById();
    }

    /**
     * Create an instance of {@link UpdateUserByIdResponse }
     * 
     */
    public UpdateUserByIdResponse createUpdateUserByIdResponse() {
        return new UpdateUserByIdResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soap.burmistrov.ru/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soap.burmistrov.ru/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soap.burmistrov.ru/", name = "findAllUsers")
    public JAXBElement<FindAllUsers> createFindAllUsers(FindAllUsers value) {
        return new JAXBElement<FindAllUsers>(_FindAllUsers_QNAME, FindAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soap.burmistrov.ru/", name = "findAllUsersResponse")
    public JAXBElement<FindAllUsersResponse> createFindAllUsersResponse(FindAllUsersResponse value) {
        return new JAXBElement<FindAllUsersResponse>(_FindAllUsersResponse_QNAME, FindAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soap.burmistrov.ru/", name = "findOneUserById")
    public JAXBElement<FindOneUserById> createFindOneUserById(FindOneUserById value) {
        return new JAXBElement<FindOneUserById>(_FindOneUserById_QNAME, FindOneUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindOneUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soap.burmistrov.ru/", name = "findOneUserByIdResponse")
    public JAXBElement<FindOneUserByIdResponse> createFindOneUserByIdResponse(FindOneUserByIdResponse value) {
        return new JAXBElement<FindOneUserByIdResponse>(_FindOneUserByIdResponse_QNAME, FindOneUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soap.burmistrov.ru/", name = "removeUserById")
    public JAXBElement<RemoveUserById> createRemoveUserById(RemoveUserById value) {
        return new JAXBElement<RemoveUserById>(_RemoveUserById_QNAME, RemoveUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soap.burmistrov.ru/", name = "removeUserByIdResponse")
    public JAXBElement<RemoveUserByIdResponse> createRemoveUserByIdResponse(RemoveUserByIdResponse value) {
        return new JAXBElement<RemoveUserByIdResponse>(_RemoveUserByIdResponse_QNAME, RemoveUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soap.burmistrov.ru/", name = "updateUserById")
    public JAXBElement<UpdateUserById> createUpdateUserById(UpdateUserById value) {
        return new JAXBElement<UpdateUserById>(_UpdateUserById_QNAME, UpdateUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.api.soap.burmistrov.ru/", name = "updateUserByIdResponse")
    public JAXBElement<UpdateUserByIdResponse> createUpdateUserByIdResponse(UpdateUserByIdResponse value) {
        return new JAXBElement<UpdateUserByIdResponse>(_UpdateUserByIdResponse_QNAME, UpdateUserByIdResponse.class, null, value);
    }

}
