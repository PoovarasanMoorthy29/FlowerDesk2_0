package com.flowerdesk.services;

import com.flowerdesk.dao.RegistrationDAO;
import com.flowerdesk.model.User;

import java.sql.SQLException;

public class SignUpService {
    private final RegistrationDAO regDAO;
    public SignUpService(RegistrationDAO dao) {
        this.regDAO = dao;
    }

    public boolean saveUser(String employeeID, String fullName, String userName, String email, String password,
                            String phoneNumber, String department, String designation, String role) {
        try {
            User user = new User(employeeID, fullName, userName, email, password,
                    phoneNumber, department, designation, role);
            return regDAO.saveUserToDB(user);
        }
        catch (SQLException e) {
            return false;
        }
    }
}
