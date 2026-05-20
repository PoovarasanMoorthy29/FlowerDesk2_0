package com.flowerdesk.view;

import com.flowerdesk.utils.InputGetter;

public class AdminDashBoardView {
    public void showMenu(){
        System.out.println("Admin Menu ");
        System.out.println("1.View Users\n" +
                "2.View IT Agents\n" +
                "3.Remove User \n" +
                "4.View Tickets\n" +
                "5.Delete Tickets\n" +
                "6.Log out");
    }
    public String getUserChoice(){
        System.out.println("Enter your choice:");
        return InputGetter.getScanner().nextLine();

    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public String getUserName() {
        System.out.println("enter the user name:");
        return InputGetter.getScanner().nextLine();
    }

    public String getTicketID() {
        System.out.println("enter the Ticket Id:");
        return InputGetter.getScanner().nextLine();
    }
}
