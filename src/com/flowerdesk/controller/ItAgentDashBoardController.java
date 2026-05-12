package com.flowerdesk.controller;

import com.flowerdesk.services.TicketServices;
import com.flowerdesk.view.ItAgentDashBoardView;
import java.sql.SQLException;

public class ItAgentDashBoardController {
    private final TicketServices services;
    private final ItAgentDashBoardView itAgentDashBoardView;

    public ItAgentDashBoardController() {
        this.services = new TicketServices();
        this.itAgentDashBoardView =new ItAgentDashBoardView();
    }

    public void init() {
        boolean running = true;

        while (running) {
            itAgentDashBoardView.showMenu();
            String option = itAgentDashBoardView.getChoice();
            try {
                switch (option) {
                    case "1" -> {
                        String message=services.viewALLTickets();
                        itAgentDashBoardView.showMessage(message);
                    }

                    case "2" -> {
                        String ticket = itAgentDashBoardView.getTicketID();
                        long ticketID = Long.parseLong(ticket);

                        String assignTo = itAgentDashBoardView.getUserToAssign();

                        if (services.assignTo(ticketID, assignTo)) {
                            itAgentDashBoardView.showMessage("Ticket assigned to " + assignTo);
                        } else {
                            itAgentDashBoardView.showMessage("Ticket not found. Please try again.");
                        }
                    }

                    case "3" -> {
                        String tickets = itAgentDashBoardView.getTicketID();
                        long ticketId = Long.parseLong(tickets);

                        String updateStat = itAgentDashBoardView.getStatusUpdate();

                        if (services.updateStatus(ticketId, updateStat)) {
                            itAgentDashBoardView.showMessage("Status Updated Successfully");
                        } else {
                            itAgentDashBoardView.showMessage("Ticket not found. Please try again.");
                        }
                    }

                    case "4" -> {
                        itAgentDashBoardView.showMessage("Logged out successfully.");
                        running = false;
                    }

                    default -> itAgentDashBoardView.showMessage("Invalid option. Please enter 1, 2, 3, or 4.");
                }

            } catch (SQLException e) {
                itAgentDashBoardView.showMessage("Database Error: " + e.getMessage());

            } catch (NumberFormatException e) {

                itAgentDashBoardView.showMessage("Invalid input! Ticket ID must be a number.");
            }
        }
    }
}

