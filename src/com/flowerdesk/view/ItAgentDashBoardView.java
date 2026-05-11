package com.flowerdesk.view;

import com.flowerdesk.utils.InputGetter;

public class ItAgentDashBoardView {
    public void showMenu(){
        System.out.println("IT Agent Menu:");
        System.out.println("1.View Tickets\n" +
                "2.Assign Ticket\n" +
                "3.update Status\n" +
                "4.Log out");

    }
    public String getChoice(){
        System.out.println("Enter your choice:");
        return InputGetter.getScanner().nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public String getUserToAssign() {
        System.out.println("Enter the user to assign :");
        return InputGetter.getScanner().nextLine();
    }

    public String getTicketID() {
        System.out.println("Enter the ticket Id :");
        return InputGetter.getScanner().nextLine();
    }

    public String getStatusUpdate() {
        System.out.println("Enter the update status(In Progress / Completed):  ");
        return InputGetter.getScanner().nextLine();
    }
}
