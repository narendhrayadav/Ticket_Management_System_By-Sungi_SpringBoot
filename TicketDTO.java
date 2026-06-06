package com.example.ticketmanagement.dto;

public class TicketDTO {

    private int ticketId;
    private String title;
    private String description;
    private String status;

    public TicketDTO() {
    }

    public TicketDTO(int ticketId, String title,
                     String description, String status) {
        this.ticketId = ticketId;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
