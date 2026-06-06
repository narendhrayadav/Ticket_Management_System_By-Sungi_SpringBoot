package com.example.ticketmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ticketmanagement.dto.TicketDTO;

@Repository
public class TicketDAOImpl implements TicketDAO {

    private List<TicketDTO> ticketList =
            new ArrayList<>();

    @Override
    public void addTicket(TicketDTO ticket) {
        ticketList.add(ticket);
    }

    @Override
    public List<TicketDTO> getAllTickets() {
        return ticketList;
    }

    @Override
    public TicketDTO getTicketById(int ticketId) {

        for (TicketDTO ticket : ticketList) {

            if (ticket.getTicketId() == ticketId) {
                return ticket;
            }
        }
        return null;
    }

    @Override
    public void deleteTicket(int ticketId) {

        TicketDTO ticket =
                getTicketById(ticketId);

        if(ticket != null) {
            ticketList.remove(ticket);
        }
    }
}
