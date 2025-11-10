package com.BikkadIT.FlightApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.FlightApi.model.Flight;
import com.BikkadIT.FlightApi.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightServiceI  {
	
	@Autowired
	private FlightRepository flightRepository;

	@Override
	public List<Flight> getAllFlight() {
		List<Flight> all = (List<Flight>) flightRepository.findAll();
		return all;
	}


 
}
