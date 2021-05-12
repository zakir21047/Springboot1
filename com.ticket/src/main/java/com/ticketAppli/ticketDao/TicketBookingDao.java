package com.ticketAppli.ticketDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketAppli.ticketDomain.Ticket;
@Repository
public interface TicketBookingDao extends JpaRepository<Ticket, Integer> {
}
