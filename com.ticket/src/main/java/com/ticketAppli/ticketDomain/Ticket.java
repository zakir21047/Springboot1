package com.ticketAppli.ticketDomain;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_id")
	private Integer ticketId;
	@Column(name = "passenger_name", nullable = false)
	private String passengerName;
	@Column(name = "source_station")
	private String sourceStation;
	@Column(name = "destination_station")
	private String destinationStation;
	@Column(name = "booking-date1")
	private Date bookingDate1;
	@Column(name = "email")
	private String email;
	@Column(name = "phoneNumber")
	private String phoneNumber;
	

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Date getBookingDate1() {
		return bookingDate1;
	}

	public void setBookingDate1(Date bookingDate1) {
		this.bookingDate1 = bookingDate1;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getGetTicketId() {
		return getGetTicketId();
	}

	
	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(java.util.Date date) {
		this.bookingDate = date;
	}

	private Date bookingDate;

}
