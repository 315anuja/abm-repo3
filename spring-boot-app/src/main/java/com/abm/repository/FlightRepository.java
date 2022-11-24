package com.abm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.abm.entity.Flights;

public interface FlightRepository extends CrudRepository<Flights, Integer> {
	
	@Query("select  f from Flights f where f.toDestination=?1 and f.fromDestination=?2")
	List<Flights> findFlight(String toDestination,String  fromDestination);

}
