package com.BikkadIT.FlightApi.serviceI;

import org.springframework.beans.factory.annotation.Autowired;

import com.BikkadIT.FlightApi.repository.PassengerRepository;
import com.BikkadIT.FlightApi.response.Ticket;
import com.BikkadIT.TicketBookigApp.request.Passanger;

public class PassengerServiceImpl  implements PassengerServiceI{

	@Autowired
	private PassengerRepository passangerRepository;
	
	@Override
	public Ticket bookTicket(Passanger psg) {
		Passanger save = passangerRepository.save(psg);

		if (save != null) {
			Ticket t = new Ticket();
			t.settPnr("8787");
			t.setTicketStatus("Booked");
			t.setTprice(789.00);
			t.setTid(11);
			return t;
		} else {

			return null;
		}

	}

}
