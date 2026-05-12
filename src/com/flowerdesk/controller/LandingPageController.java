package com.flowerdesk.controller;


import com.flowerdesk.view.LandingPageView;


public class LandingPageController {
    private LandingPageView view=new LandingPageView();

    public void init(){
        while(true){
            view.showMenu();
            String choice=view.getUserChoice().trim();
            switch (choice) {
                case "1" -> {
                    SignUpController signUpController = new SignUpController();
                    signUpController.init();
                }
                case "2" -> {
                    LoginController loginController = new LoginController();
                    loginController.init();
                }
                case "3" -> {
                    System.out.println("Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("<!Important> : Please Select Valid Choice among Menu ");
            }

        }



    }




}
