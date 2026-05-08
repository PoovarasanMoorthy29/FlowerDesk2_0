package com.flowerdesk.model;

public class Tickets {
    private String ticketID;
    private String title;
    private String description;
    private String priority;
    private String status;

    public Tickets(String ticketID, String description, String title, String priority, String status) {
        this.ticketID = ticketID;
        this.description = description;
        this.title = title;
        this.priority = priority;
        this.status = status;
    }

    public String getTicketID() {
        return ticketID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }
}
