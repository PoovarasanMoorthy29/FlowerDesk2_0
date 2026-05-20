package com.flowerdesk.services;

import com.flowerdesk.dao.TicketDAO;
import com.flowerdesk.model.Tickets;

import java.sql.SQLException;

public class TicketServices {
    private final TicketDAO ticketDAO;
    public TicketServices(){
        this.ticketDAO=new TicketDAO();
    }

    public boolean deleteTicket(String username,long id) throws SQLException {
        return ticketDAO.deleteTicket(username,id);
        
    }

    public boolean viewTickets(String name) throws SQLException {
        return ticketDAO.viewTickets(name);
        
    }


    public boolean createTicket(String userName, String title, String description, String priority) throws SQLException {

        Tickets ticket=new Tickets(userName,title,description,priority);
        return ticketDAO.createTicket(ticket);
    }

    public String viewALLTickets() throws SQLException {
        return ticketDAO.viewAllTickets();
    }

    public boolean assignTo(long ticketID,String assignTo) throws SQLException {
        return ticketDAO.assignTo(ticketID,assignTo);
    }

    public boolean updateStatus(long ticketIds, String updateStat) throws SQLException {
        return ticketDAO.updateStatus(ticketIds,updateStat);
    }

    public String  viewUsers() throws SQLException {
        return ticketDAO.viewUsers();
    }

    public String viewItAgents() throws SQLException {
        return ticketDAO.viewITAgents();
    }

    public boolean deleteUser(String userName) throws SQLException {
        return ticketDAO.deleteUser(userName);
    }

    public String  viewAllTickets() throws SQLException {
        return ticketDAO.viewAllTickets();
    }
}
