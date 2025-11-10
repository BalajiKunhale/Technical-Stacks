package com.BikkadIT.FlightApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.FlightApi.model.Flight;
import com.BikkadIT.FlightApi.service.FlightServiceI;
import java.util.List;

@RestController
public class FlightController {
	
	@Autowired
	private FlightServiceI flightServiceI;
	
	@GetMapping(value = "/getAllFlight", produces = "application/json")
	public ResponseEntity<List<Flight>> getAllFlight() {
		List<Flight> allFlight = flightServiceI.getAllFlight();
System.out.println(allFlight);
		return new ResponseEntity<List<Flight>>(allFlight, HttpStatus.OK);

	}



}
