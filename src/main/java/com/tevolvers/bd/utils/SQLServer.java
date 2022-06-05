package com.tevolvers.bd.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServer {
    public static Connection connection(){
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://SQL5074.site4now.net:1433;" +
                    "databaseName= db_a46019_test;" +
                    "user= db_a46019_test_admin;" +
                    "password= test1234");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
