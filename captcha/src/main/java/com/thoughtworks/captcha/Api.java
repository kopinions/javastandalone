package com.thoughtworks.captcha;

import org.glassfish.jersey.server.ResourceConfig;

public class Api extends ResourceConfig {

    public Api() {
        packages("com.thoughtworks.captcha");
    }
}
