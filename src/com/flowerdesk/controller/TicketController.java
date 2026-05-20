package com.flowerdesk.controller;

import com.flowerdesk.services.TicketServices;
import com.flowerdesk.view.TicketView;

public class TicketController {
    private final TicketView ticketView;
    private final TicketServices ticketServices;
    public TicketController(TicketView view,TicketServices service){
        this.ticketView=view;
        this.ticketServices=service;
    }
    public void init(){

    }
}
