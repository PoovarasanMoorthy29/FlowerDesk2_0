package com.flowerdesk.model;

public class Tickets {
    private String userName;
    private String title;
    private String description;
    private String priority;

    public Tickets(String userName, String title, String description, String priority) {
        this.userName = userName;
        this.title = title;
        this.description = description;
        this.priority = priority;
    }


    public String getUserName(){
        return userName;
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

}
