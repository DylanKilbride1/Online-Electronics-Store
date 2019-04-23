package com.assignment.softwarepatterns.repositories;

import com.assignment.softwarepatterns.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository <Customer, Long> {

	Customer findCustomerByCustomerId(long id);
	Customer findCustomerByEmail(String email);
	boolean existsByEmailAndPassword(String email, String password);
	boolean existsByEmail(String email);

}
