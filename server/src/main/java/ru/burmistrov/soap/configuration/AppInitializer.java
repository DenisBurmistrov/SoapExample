package ru.burmistrov.soap.configuration;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;


public class AppInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext container) {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(SpringConfiguration.class, ServiceConfiguration.class);

        container.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcher
                = container.addServlet("dispatcher", new CXFServlet());
        dispatcher.addMapping("/services/*");
    }
}
