package com.example.ticketmanagement.service;

import java.util.List;

import com.example.ticketmanagement.dto.TicketDTO;

public interface TicketService {

    String addTicket(TicketDTO ticket);

    List<TicketDTO> getAllTickets();

    TicketDTO getTicketById(int ticketId);

    String updateTicketStatus(
            int ticketId,
            String status);

    String deleteTicket(int ticketId);
}
