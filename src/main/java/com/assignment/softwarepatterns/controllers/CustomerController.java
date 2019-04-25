package com.assignment.softwarepatterns.controllers;

import com.assignment.softwarepatterns.models.Customer;
import com.assignment.softwarepatterns.models.Product;
import com.assignment.softwarepatterns.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/getallcustomers",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

}
