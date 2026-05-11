package com.flowerdesk.controller;

import com.flowerdesk.services.LoginService;
import com.flowerdesk.view.LoginView;

import java.sql.SQLException;

public class LoginController {
    private final LoginView loginView;
    private final LoginService loginService;
    private final UserDashboardController userControl;
    private final AdminDashBoardController adminControl;
    private final ItAgentDashBoardController itControl;

    public LoginController(LoginView view, LoginService service,UserDashboardController control
            ,ItAgentDashBoardController itControl,AdminDashBoardController adminControl) {
        this.loginView = view;
        this.loginService = service;
        this.userControl=control;
        this.itControl=itControl;
        this.adminControl=adminControl;
    }

    public void init() {
        proceedLogin();
    }

    private void proceedLogin() {
        String userName = loginView.getUserName();
        String password = loginView.getPassword();
        String role=loginView.getRole();
        try{
            if(loginService.checkCredentials(userName,password,role)){
                if(role.equalsIgnoreCase("U")){
                    userControl.init();

                }
                else if(role.equalsIgnoreCase("Admin")){
                    adminControl.init();

                }
                else{
                    itControl.init();
                }
            }
            else{
                loginView.showMessage("Please enter correct User name and password");
            }


        } catch (SQLException e) {
            loginView.showMessage("Unexcepted exception arise please try again");
        }

    }
}
