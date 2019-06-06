package ru.burmistrov.soap.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.burmistrov.soap.api.endpoint.IUserEndpoint;
import ru.burmistrov.soap.endpoint.UserEndpointService;

@Component
public class EndpointProducer {

    @Autowired
    private UserEndpointService userEndpointService;

    @Bean
    public IUserEndpoint getUserEndpoint() {
        return userEndpointService.getUserEndpointPort();
    }
}
