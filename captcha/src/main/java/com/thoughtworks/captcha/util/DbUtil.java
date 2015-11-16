package com.thoughtworks.captcha.util;

import com.thoughtworks.cloud.CloudEnvironment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class DbUtil {

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection != null)
            return connection;
        else {
            try {
                CloudEnvironment env = new CloudEnvironment();
                Map<String, Object> mysql = env.getServiceDataByName("mysql");
                connection = DriverManager.getConnection(String.valueOf(mysql.get("uri")));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
        }

    }
}
