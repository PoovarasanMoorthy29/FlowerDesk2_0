package com.flowerdesk.dao;

import com.flowerdesk.configuration.DatabaseConfig;
import com.flowerdesk.model.User;


import java.sql.PreparedStatement;

import java.sql.SQLException;

public class RegistrationDAO {


    public boolean saveUserToDB(User user) throws SQLException {
        String sql ="INSERT INTO users(employee_id,full_name, " +
                "username,email,password,phone_number,department," +
                "designation, role)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps=DatabaseConfig.getConnection().prepareStatement(sql);
            ps.setString(1,user.getEmployeeID());
            ps.setString(2,user.getFullName());
            ps.setString(3,user.getUserName());
            ps.setString(4,user.getEmail());
            ps.setString(5,user.getPassword());
            ps.setString(6,user.getPhoneNumber());
            ps.setString(7,user.getDepartment());
            ps.setString(8,user.getDesignation());
            ps.setString(9,user.getRole());
            int res=ps.executeUpdate();
            return res>0;
        }
        catch (SQLException e){
            throw new SQLException(e);
        }
    }

}
