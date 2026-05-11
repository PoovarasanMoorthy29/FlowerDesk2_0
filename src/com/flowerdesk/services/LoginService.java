package com.flowerdesk.services;

import com.flowerdesk.dao.LoginDAO;

import java.sql.SQLException;

public class LoginService {
    private final LoginDAO loginDAO;
    public LoginService(LoginDAO dao){
        this.loginDAO=dao;
    }

    public boolean checkCredentials(String userName, String password,String role)throws SQLException {
        return loginDAO.checkUserLogin(userName,password ,role);
    }


}
