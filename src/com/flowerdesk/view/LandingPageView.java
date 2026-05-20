package com.flowerdesk.view;


import com.flowerdesk.controller.LandingPageController;
import com.flowerdesk.utils.InputGetter;

public class LandingPageView {
    public void showMenu(){
        System.out.println("1.Sign Up\n" +
                "2.Login\n" +
                "3.Exit");

    }
    public String getUserChoice(){
        System.out.println("Enter your option:");
        return InputGetter.getScanner().nextLine();
    }


    public void showMessage(String message){
        System.out.println(message);
    }
}
