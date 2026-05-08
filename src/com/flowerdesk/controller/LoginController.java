package com.flowerdesk.controller;

import com.flowerdesk.services.LoginService;
import com.flowerdesk.view.LoginView;

public class LoginController {
    private final LoginView loginView;
    private final LoginService loginService;
    public LoginController(LoginView view,LoginService service){
        this.loginView=view;
        this.loginService=service;
    }
    public void init(){

    }
}
