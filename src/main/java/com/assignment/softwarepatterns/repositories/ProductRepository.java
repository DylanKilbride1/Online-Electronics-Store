package com.assignment.softwarepatterns.repositories;

import com.assignment.softwarepatterns.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product, Long> {

}
