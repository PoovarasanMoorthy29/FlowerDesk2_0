package com.flowerdesk.view;

import com.flowerdesk.utils.InputGetter;

public class UserDashBoardView {
    public void userMenu(){
        System.out.println("User Menu");
        System.out.println("1.Create a ticket\n" +
                        "2.Delete Ticket\n" +
                        "3.View Tickets\n" +
                      "4.Log out");

    }
    public String getUserChoice(){
        System.out.println("Enter your choice:");
        return InputGetter.getScanner().nextLine();
    }
    public String getUserName(){
        System.out.println("Enter user Name:");
        return InputGetter.getScanner().nextLine();
    }
    public String getTicketTitle(){
        System.out.println("Enter the title of ticket:");
        return InputGetter.getScanner().nextLine();
    }
    public String getTicketDescription(){
        System.out.println("Enter Description :");
        return InputGetter.getScanner().nextLine();
    }
    public String getPriority(){
        System.out.println("Set the priority ( L / M / H) : ");
        return InputGetter.getScanner().nextLine();
    }
    public void showMessage(String message){
        System.out.println(message);
    }

    public String getTicketId() {
        System.out.println("Enter ticketID:");
        return InputGetter.getScanner().nextLine();
    }
}
