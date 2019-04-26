package com.assignment.softwarepatterns.services;

import com.assignment.softwarepatterns.models.AuthorisationResponse;
import com.assignment.softwarepatterns.models.Customer;
import com.assignment.softwarepatterns.models.LoginDetails;
import com.assignment.softwarepatterns.repositories.AdministratorRepository;
import com.assignment.softwarepatterns.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AdministratorRepository administratorRepository;

	public AuthorisationResponse customerLogin(LoginDetails loginDetails) {
		if(customerRepository.existsByEmailAndPassword(loginDetails.getEmail(),
						loginDetails.getPassword())) {
			return new AuthorisationResponse(loginDetails.getEmail(),
							true);
		} else {
			return new AuthorisationResponse("0", false);
		}
	}

	public AuthorisationResponse administratorLogin(LoginDetails loginDetails) {
		if(administratorRepository.existsByEmailAndPassword(loginDetails.getEmail(),
						loginDetails.getPassword())) {
			return new AuthorisationResponse(loginDetails.getEmail(),
							true);
		} else {
			return new AuthorisationResponse("0", false);
		}
	}

	public AuthorisationResponse customerRegistration(LoginDetails loginDetails) {
		if(customerRepository.existsByEmail(loginDetails.getEmail())) {
			return new AuthorisationResponse("0", false);
		} else {
			customerRepository.save(new Customer(loginDetails.getUsername(),
							loginDetails.getEmail(),
							loginDetails.getPassword()));
			return new AuthorisationResponse(loginDetails.getEmail(),
							true);
		}
	}

}
