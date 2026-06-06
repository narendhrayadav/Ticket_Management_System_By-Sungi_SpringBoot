package com.example.ticketmanagement.dto;

public class BugTicketDTO extends TicketDTO {

    private String severity;

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }
}
