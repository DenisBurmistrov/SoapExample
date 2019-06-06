package ru.burmistrov.soap.configuration;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.burmistrov.soap.api.endpoint.IUserEndpoint;

import javax.xml.ws.Endpoint;

@Configuration
public class ServiceConfiguration {

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public Endpoint endpointUser(IUserEndpoint userEndpoint) {
        EndpointImpl endpoint = new EndpointImpl(springBus(), userEndpoint);
        endpoint.publish("/userEndpoint");
        return endpoint;
    }
}
