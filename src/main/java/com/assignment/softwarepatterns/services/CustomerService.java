package com.assignment.softwarepatterns.services;

import com.assignment.softwarepatterns.models.Customer;
import com.assignment.softwarepatterns.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class CustomerService {

	@Inject
	CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		return customerRepository.findAllCustomers();
	}
}
