package com.assignment.softwarepatterns.repositories;

import com.assignment.softwarepatterns.models.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository <Product, Long> {

	@Query(value = "SELECT * FROM product", nativeQuery = true)
	List<Product> getAllProducts();
}
