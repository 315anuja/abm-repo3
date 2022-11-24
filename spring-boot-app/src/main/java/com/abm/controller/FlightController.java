package com.abm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.abm.entity.Flights;
import com.abm.service.FlightService;
@RestController
public class FlightController {
	@Autowired 
	private FlightService flightService;
	
	@RequestMapping("/flight")
	public List<Flights> findFlight(@RequestParam("toDestination") String toDestination,@RequestParam("fromDestination") String fromDestination ) {
		List<Flights> ft=flightService.findAvailableFlight(toDestination, fromDestination);
		return ft;
		
		
	}
	
	
	
	
}
