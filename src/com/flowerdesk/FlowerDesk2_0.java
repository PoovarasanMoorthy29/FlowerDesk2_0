package com.flowerdesk;

import com.flowerdesk.controller.LoginController;
import com.flowerdesk.controller.SignUpController;
import com.flowerdesk.controller.TicketController;
import com.flowerdesk.data.dao.LoginDAO;
import com.flowerdesk.data.dao.RegistrationDAO;
import com.flowerdesk.data.dao.TicketDAO;
import com.flowerdesk.services.LoginService;
import com.flowerdesk.services.SignUpService;
import com.flowerdesk.services.TicketServices;
import com.flowerdesk.utils.AppInfo;
import com.flowerdesk.utils.InputGetter;
import com.flowerdesk.view.LoginView;
import com.flowerdesk.view.SignUpView;
import com.flowerdesk.view.TicketView;

import java.util.InputMismatchException;

public class FlowerDesk2_0 {

    public static void main(String[] args) {
        //signUp dependency objects
        SignUpView signUpView=new SignUpView();
        RegistrationDAO regDAO=new RegistrationDAO();
        SignUpService signUpService=new SignUpService(regDAO);
        SignUpController signUpController=new SignUpController(signUpView,signUpService);

        // login dependency objects
        LoginView loginView=new LoginView();
        LoginDAO loginDAO=new LoginDAO();
        LoginService loginService=new LoginService(loginDAO);
        LoginController loginController=new LoginController(loginView,loginService);

        // Ticket dependency objects
        TicketView ticketView=new TicketView();
        TicketDAO ticketDAO=new TicketDAO();
        TicketServices ticketServices=new TicketServices(ticketDAO);
        TicketController ticketController=new TicketController(ticketView,ticketServices);

        // landing page..
        System.out.println("--------------------------------------------------------------------");
        System.out.println("|                       "
                + AppInfo.getAppName()
                +AppInfo.getVersionNumber()+
                "                            |");
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        while(true){
            try {
                System.out.println("< Login / SignUp Menu >    ");
                System.out.println();
                System.out.println("1.SignUp / Registration\n" +
                        "2.Login\n" +
                        "3.Exit");
                System.out.println("Enter your option:");
                int option = InputGetter.getScanner().nextInt();
                if (option == 1) {
                    signUpController.init();
                } else if (option == 2) {
                    loginController.init();
                } else if (option == 3) {
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("                            Thank you!                              ");
                    System.out.println("--------------------------------------------------------------------");
                    System.exit(0);
                } else {
                    System.out.println("!IMPORTANT: <- Please Enter valid option ->");
                }
            }
            catch (InputMismatchException e){
                System.out.println("--------------------------Exception------------------------------");
                System.out.println("                 Please enter Number As Input option             ");
                System.out.println("-----------------------------------------------------------------");
                InputGetter.getScanner().nextLine();

            } catch (Exception e) {
                System.out.println("UnExcepted Exception happened.Please Try Again !");
                InputGetter.getScanner().nextLine();

            }
        }


    }
}
