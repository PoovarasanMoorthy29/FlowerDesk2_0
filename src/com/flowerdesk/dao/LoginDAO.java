package com.flowerdesk.dao;

import com.flowerdesk.configuration.DatabaseConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
    public boolean checkUserLogin(String userName, String password,String role) throws SQLException{
        String sql = "SELECT 1 FROM users WHERE userName=? AND password=? AND role=?";

        // Try-with-resources ensures Connection, PreparedStatement, and ResultSet are closed
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, userName);
            ps.setString(2, password);
            ps.setString(3, role);

            try (ResultSet res = ps.executeQuery()) {
                return res.next();
            }
        }
        catch (SQLException e){
            throw new SQLException(e);
        }
    }


}
