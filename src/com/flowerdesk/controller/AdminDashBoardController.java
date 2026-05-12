package com.flowerdesk.controller;

import com.flowerdesk.services.TicketServices;
import com.flowerdesk.view.AdminDashBoardView;

import java.sql.SQLException;

public class AdminDashBoardController {
    private AdminDashBoardView view;
    private TicketServices services;

    public AdminDashBoardController() {
        this.view = new AdminDashBoardView();
        this.services = new TicketServices();
    }

    public void init(){
        System.out.println("Welcome Admin!");
        while(true){
            view.showMenu();
            try {
                String option = view.getUserChoice();
                if(option.equals("1")){
                    String message=services.viewUsers();
                    view.showMessage(message);
                }
                else if(option.equals("2")){
                    String msg=services.viewItAgents();
                    view.showMessage(msg);

                }
                else if(option.equals("3")){
                    String userName=view.getUserName();
                    if(services.deleteUser(userName)){
                        view.showMessage("Successfully Completed");
                    }
                    else{
                        view.showMessage("Please try again");
                    }
                }
                else if(option.equals("4")){
                    String message=services.viewAllTickets();
                }
                else if(option.equals("5")){
                    String userNames= view.getUserName();
                    String ticketsIds=view.getTicketID();
                    long ticketId=Long.parseLong(ticketsIds);
                    if(services.deleteTicket(userNames,ticketId)){
                        view.showMessage("Deleted successfully");
                    }
                }
                else if(option.equals("6")){
                    view.showMessage("Logged out");
                    break;
                }

            } catch (SQLException e) {
                view.showMessage("Please try again");
            }


        }
    }
}
