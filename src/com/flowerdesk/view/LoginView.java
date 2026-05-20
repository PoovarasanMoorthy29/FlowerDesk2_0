package com.flowerdesk.view;

import com.flowerdesk.utils.InputGetter;

public class LoginView {
    public String getUserName(){
        System.out.println("Enter your UserName:");
        return InputGetter.getScanner().nextLine().trim();
    }
    public String getPassword(){
        System.out.println("Enter your password:");
        return InputGetter.getScanner().nextLine().trim();

    }
    public void showMessage(String message){
        System.out.println(message);
    }

    public String getRole() {
        System.out.println("Enter your role:");
        return InputGetter.getScanner().nextLine().trim();
    }
}
