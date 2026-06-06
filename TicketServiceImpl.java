package com.example.ticketmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ticketmanagement.dao.TicketDAO;
import com.example.ticketmanagement.dto.TicketDTO;

@Service
public class TicketServiceImpl
        implements TicketService {

    @Autowired
    private TicketDAO ticketDAO;

    @Override
    public String addTicket(TicketDTO ticket) {

        ticketDAO.addTicket(ticket);

        return "Ticket Added Successfully";
    }

    @Override
    public List<TicketDTO> getAllTickets() {
        return ticketDAO.getAllTickets();
    }

    @Override
    public TicketDTO getTicketById(int ticketId) {
        return ticketDAO.getTicketById(ticketId);
    }

    @Override
    public String updateTicketStatus(
            int ticketId,
            String status) {

        TicketDTO ticket =
                ticketDAO.getTicketById(ticketId);

        if(ticket != null) {
            ticket.setStatus(status);
            return "Status Updated";
        }

        return "Ticket Not Found";
    }

    @Override
    public String deleteTicket(int ticketId) {

        ticketDAO.deleteTicket(ticketId);

        return "Ticket Deleted";
    }
}
