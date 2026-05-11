package com.flowerdesk;

import com.flowerdesk.controller.*;
import com.flowerdesk.dao.LoginDAO;
import com.flowerdesk.dao.RegistrationDAO;
import com.flowerdesk.dao.TicketDAO;
import com.flowerdesk.services.LoginService;
import com.flowerdesk.services.SignUpService;
import com.flowerdesk.services.TicketServices;
import com.flowerdesk.utils.AppInfo;
import com.flowerdesk.utils.InputGetter;
import com.flowerdesk.view.*;


public class FlowerDesk2_0 {

    public static void main(String[] args)  {


        TicketView ticketView = new TicketView();
        TicketDAO ticketDAO = new TicketDAO();
        TicketServices ticketServices = new TicketServices(ticketDAO);
        TicketController ticketController = new TicketController(ticketView, ticketServices);

        //signUp dependency objects
        SignUpView signUpView = new SignUpView();
        RegistrationDAO regDAO = new RegistrationDAO();
        SignUpService signUpService = new SignUpService(regDAO);
        SignUpController signUpController = new SignUpController(signUpView, signUpService);

        UserDashBoardView userView=new UserDashBoardView();
        UserDashboardController userControl=new UserDashboardController(userView,ticketServices);
        ItAgentDashBoardView itAgentDashBoardView=new ItAgentDashBoardView();

        ItAgentDashBoardController itAgentControl=new ItAgentDashBoardController(ticketServices,itAgentDashBoardView);
        AdminDashBoardView adminDashBoardView=new AdminDashBoardView();
        AdminDashBoardController adminControl=new AdminDashBoardController(adminDashBoardView,ticketServices);

        // login dependency objects
        LoginView loginView = new LoginView();
        LoginDAO loginDAO = new LoginDAO();
        LoginService loginService = new LoginService(loginDAO);
        LoginController loginController = new LoginController(loginView, loginService,userControl,itAgentControl,adminControl);


        System.out.println("--------------------------------------------------------------------");
        System.out.println("|                       "
                + AppInfo.getAppName()
                + AppInfo.getVersionNumber() +
                "                            |");
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        while (true) {
            System.out.println("< Login / SignUp Menu >    ");
            System.out.println();
            System.out.println("1.SignUp / Registration\n" +
                    "2.Login\n" +
                    "3.Exit");
            System.out.println("Enter your option:");
            String option = InputGetter.getScanner().nextLine();
            if (option.equals("1")) {
                signUpController.init();
            } else if (option.equals("2") ) {
                loginController.init();
            } else if (option.equals("3")) {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("                            Thank you!                              ");
                System.out.println("--------------------------------------------------------------------");
                System.exit(0);
            } else {
                System.out.println("!IMPORTANT: <- Please Enter valid option ->");
            }
        }
    }
}
