package com.thoughtworks.captcha;

import com.thoughtworks.captcha.util.DbUtil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.sql.*;

@Path("captcha")
public class CaptchaResource {
    @GET
    public Response captcha() throws SQLException {
        Connection connection = DbUtil.getConnection();
        ResultSet catalogs = connection.getMetaData().getCatalogs();
        StringBuilder builder = new StringBuilder();

        while (catalogs.next()) {
            builder.append("db name:\t")
                    .append(catalogs.getString("TABLE_CAT"))
                    .append("</br>");
        }
        catalogs.close();

        return Response.ok(builder.toString()).build();
    }
}
