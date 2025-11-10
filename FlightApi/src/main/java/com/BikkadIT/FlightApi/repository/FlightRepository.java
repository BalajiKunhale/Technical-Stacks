package com.BikkadIT.FlightApi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.FlightApi.model.Flight;
@Repository
public interface FlightRepository extends CrudRepository<Flight, Integer>  {
	

}
 