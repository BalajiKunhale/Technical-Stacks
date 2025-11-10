package com.BikkadIT.FlightApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.FlightApi.response.Ticket;
import com.BikkadIT.FlightApi.serviceI.PassengerServiceI;
import com.BikkadIT.TicketBookigApp.request.Passanger;

@RestController
public class PassengerController {
	
	@Autowired
	private PassengerServiceI passangerServiceI;
	
	@PostMapping(value = "bookTicket", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger psg) {
		Ticket bookTicket = passangerServiceI.bookTicket(psg);
		return new ResponseEntity<Ticket>(bookTicket, HttpStatus.CREATED);

	}



}
