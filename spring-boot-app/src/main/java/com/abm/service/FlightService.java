package com.abm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.Flights;
import com.abm.repository.FlightRepository;
@Transactional
@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;
	
	
	public List<Flights> findAvailableFlight(String toDestination,String  fromDestination){
		
		List<Flights> flights=flightRepository.findFlight(toDestination, fromDestination);
		return flights;
	}

}
