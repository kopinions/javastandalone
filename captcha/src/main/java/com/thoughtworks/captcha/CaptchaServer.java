package com.thoughtworks.captcha;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.servlet.WebappContext;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.servlet.ServletContainer;

import javax.servlet.ServletRegistration;
import java.net.URI;

public class CaptchaServer {

    public static void main(String[] args) throws Exception {
        WebappContext context = new WebappContext("Captcha", "/");

        ServletRegistration servletRegistration = context.addServlet("ServletContainer",
                new ServletContainer(new Api()));

        servletRegistration.addMapping("/*");

        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(URI.create("http://0.0.0.0:8081"));
        context.deploy(server);

        server.start();
        while (true) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                server.shutdownNow();
            }
        }
    }


}
