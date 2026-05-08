package com.flowerdesk.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static final String URL="jdbc:mysql://localhost:3306/FlowerDesk";
    private static final String USER_NAME="root";
    private static final String PASSWORD="Aadhi@123";

    public static Connection getConnection()throws SQLException {
        return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
    }

}
