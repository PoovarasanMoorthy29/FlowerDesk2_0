package com.flowerdesk.controller;

import com.flowerdesk.services.TicketServices;
import com.flowerdesk.utils.InputGetter;
import com.flowerdesk.view.UserDashBoardView;

import java.sql.SQLException;

public class UserDashboardController {
    private final UserDashBoardView view;
    private final TicketServices services;

    public UserDashboardController() {
        this.view = new UserDashBoardView();
        this.services = new TicketServices();
    }
    public  void init(){
        try{
        label:
        while(true) {
            view.userMenu();
            String option = view.getUserChoice();
            switch (option) {
                case "1":
                    String userName=view.getUserName();
                    String title= view.getTicketTitle();
                    String description=view.getTicketDescription();
                    String priority= view.getPriority();
                    if(services.createTicket(userName,title,description,priority)){
                        view.showMessage("Ticket Created successfully");
                    }
                    else{
                        view.showMessage("Ticket doesn't Create please try again");
                        break;
                    }
                    break;

                case "2":
                    String ticketID=view.getTicketId();
                    String username=view.getUserName();
                    long id=Long.parseLong(ticketID);
                    if(services.deleteTicket(username,id)){
                        view.showMessage("Deleted successfully");
                    }
                    else{
                        view.showMessage("Please try again");
                    }
                    break;
                case "3":
                    String userTicket= view.getUserName();
                    if(services.viewTickets(userTicket)){
                        view.showMessage("Listed");
                    }
                    else{
                        view.showMessage("Please try again");
                    }
                    break;
                case "4":
                    break label;
            }
        }
        }
        catch (SQLException e){
            view.showMessage(e.getMessage());
        }
    }
}
