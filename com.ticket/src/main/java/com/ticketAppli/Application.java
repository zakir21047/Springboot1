package com.ticketAppli;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ticketAppli.ticketDomain.Ticket;
import com.ticketAppli.ticketService.Ticketservice;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private Ticketservice service;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	public void run(String...args) throws Exception{
        Ticket ticket = new Ticket();
        ticket.setPassengerName("Afreed Shaik");
        ticket.setEmail("afreed405shaik@gmail.com");
        ticket.setSourceStation("Hyderabad");
        ticket.setDestinationStation("Kurnool");
        ticket.setBookingDate1(new Date());
       service.createTicket(ticket);
}
	}
