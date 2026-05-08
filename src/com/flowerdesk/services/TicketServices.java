package com.flowerdesk.services;

import com.flowerdesk.data.dao.TicketDAO;

public class TicketServices {
    private final TicketDAO ticketDAO;
    public TicketServices(TicketDAO dao){
        this.ticketDAO=dao;
    }
}
