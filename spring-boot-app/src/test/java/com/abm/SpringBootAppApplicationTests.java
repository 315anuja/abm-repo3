package com.abm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abm.entity.Customer;
import com.abm.entity.Flights;
import com.abm.repository.CustomerRepository;
import com.abm.repository.FlightRepository;

@SpringBootTest
class SpringBootAppApplicationTests {
	@Autowired
	private CustomerRepository custRepo;
	
	@Autowired
	private FlightRepository flightrepo;
	

	@Test
	void addCustomer() {
		Customer cust=new Customer();
		cust.setName("Preeti");
		cust.setEmail("Preetil@gmail.com");
		cust.setPassword("pass@123");
		cust.setMobileNumber("8664764646");
		custRepo.save(cust);
	}
	
	
	@Test
	void addFlight() {
		Flights flight=new Flights();
		flight.setFilghtname("SPIjak");
		flight.setFromDestination("MUMBAI");
		flight.setToDestination("DELHI");
		
		flightrepo.save(flight);
	}

}
