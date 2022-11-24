package com.abm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abm.entity.Customer;
import com.abm.exception.CustomerServiceException;
import com.abm.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	private boolean isCustomerPresent(String email) {
		/*long a=customerRepository.findByEmail(email);
		if(a==1)
		return true;*/
		
		return customerRepository.findByEmail(email)==1L;
	
	}
	
	public void register(Customer customer) {
		if(isCustomerPresent(customer.getEmail()))
			throw new CustomerServiceException("Customer already register");
		else
			customerRepository.save(customer);
	}
	
}
