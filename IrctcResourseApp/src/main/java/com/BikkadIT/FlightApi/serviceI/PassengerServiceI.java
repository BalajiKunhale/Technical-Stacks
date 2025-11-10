package com.BikkadIT.FlightApi.serviceI;

import com.BikkadIT.FlightApi.response.Ticket;
import com.BikkadIT.TicketBookigApp.request.Passanger;

public interface PassengerServiceI {
	
	public Ticket bookTicket(Passanger psg);

}
