package com.example.ticketmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ticketmanagement.dto.TicketDTO;
import com.example.ticketmanagement.service.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/add")
    public String addTicket(
            @RequestBody TicketDTO ticket) {

        return ticketService.addTicket(ticket);
    }

    @GetMapping("/all")
    public List<TicketDTO> getAllTickets() {

        return ticketService.getAllTickets();
    }

    @GetMapping("/{id}")
    public TicketDTO getTicket(
            @PathVariable int id) {

        return ticketService.getTicketById(id);
    }

    @PutMapping("/{id}/{status}")
    public String updateStatus(
            @PathVariable int id,
            @PathVariable String status) {

        return ticketService
                .updateTicketStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public String deleteTicket(
            @PathVariable int id) {

        return ticketService.deleteTicket(id);
    }
}
