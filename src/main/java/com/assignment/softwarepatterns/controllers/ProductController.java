package com.assignment.softwarepatterns.controllers;

import com.assignment.softwarepatterns.models.Product;
import com.assignment.softwarepatterns.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@SuppressWarnings("Duplicates")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/getallproducts/{sortType}",
					method = RequestMethod.GET,
	        produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Product> getAllProducts(@PathVariable("sortType") String sortType) {
		return productService.getAllProducts(sortType);
	}
}
