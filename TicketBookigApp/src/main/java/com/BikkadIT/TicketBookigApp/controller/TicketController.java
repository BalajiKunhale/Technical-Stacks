package com.BikkadIT.TicketBookigApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.TicketBookigApp.request.Passanger;
import com.BikkadIT.TicketBookigApp.response.Ticket;

@RestController
public class TicketController {
	
	
	@PostMapping(value="/bookTicket",consumes = {"application/json","application/xml"},produces = 
     { "application/json","application/xml"})
     public ResponseEntity<Ticket> bookTicket(@RequestBody Passanger psg){
		System.out.println(psg);
		
		Ticket t=new Ticket();
		t.setTid(11);
		t.setPnr("677");
		t.setTstatus("BOOKED");
		return new ResponseEntity<Ticket>(t,HttpStatus.OK);


   }
}
