package com.assignment.softwarepatterns.repositories;

import com.assignment.softwarepatterns.models.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository <Customer, Long> {

	Customer findCustomerByCustomerId(long id);
	Customer findCustomerByEmail(String email);
	boolean existsByEmailAndPassword(String email, String password);
	boolean existsByEmail(String email);
	@Query(value = "SELECT * FROM Customer", nativeQuery = true)
	List<Customer> findAllCustomers();

}
