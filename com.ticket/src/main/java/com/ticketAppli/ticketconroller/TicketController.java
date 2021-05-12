package com.ticketAppli.ticketconroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketAppli.ticketDomain.Ticket;
import com.ticketAppli.ticketService.Ticketservice;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
	@Autowired
	private Ticketservice service;

	@GetMapping("/getAllTickets")
	public Iterable<Ticket> getAllTickets() {
		return service.getAllTickets();
	}

	@PostMapping("/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return service.createTicket(ticket);
	}

	@DeleteMapping("/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		service.deleteTicket(ticketId);
	}

	@PutMapping("/ticket/{ticketId} {new Email}")
	public Ticket updateTicket(@PathVariable("TicketId") Integer ticketId, @PathVariable("newEmail") String newEmail) {
		return service.updateTicket(ticketId, newEmail);

	}
}
