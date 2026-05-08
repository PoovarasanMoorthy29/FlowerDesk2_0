package com.flowerdesk.services;

import com.flowerdesk.data.dao.LoginDAO;

public class LoginService {
    private final LoginDAO loginDAO;
    public LoginService(LoginDAO dao){
        this.loginDAO=dao;
    }
}
