package com.example.ticketmanagement.dao;

import java.util.List;
import com.example.ticketmanagement.dto.TicketDTO;

public interface TicketDAO {

    void addTicket(TicketDTO ticket);

    List<TicketDTO> getAllTickets();

    TicketDTO getTicketById(int ticketId);

    void deleteTicket(int ticketId);
}
