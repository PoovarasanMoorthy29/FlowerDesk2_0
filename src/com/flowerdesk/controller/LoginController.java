package com.flowerdesk.controller;

import com.flowerdesk.services.LoginService;
import com.flowerdesk.view.LoginView;

import java.sql.SQLException;

public class LoginController {
    private final LoginView loginView;
    private final LoginService loginService;

    public LoginController() {
        this.loginView = new LoginView();
        this.loginService = new LoginService();

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
                    UserDashboardController userControl=new UserDashboardController();
                    userControl.init();

                }
                else if(role.equalsIgnoreCase("Admin")){
                    AdminDashBoardController adminControl=new AdminDashBoardController();
                    adminControl.init();

                }
                else{
                    ItAgentDashBoardController itControl=new ItAgentDashBoardController();
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
