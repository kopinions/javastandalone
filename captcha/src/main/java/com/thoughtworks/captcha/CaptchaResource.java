package com.thoughtworks.captcha;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("captcha")
public class CaptchaResource {
    @GET
    public Response captcha() {
        return Response.ok().build();
    }
}
