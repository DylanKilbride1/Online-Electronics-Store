package com.assignment.softwarepatterns.controllers;

import com.assignment.softwarepatterns.models.Product;
import com.assignment.softwarepatterns.sorting.AscendingPriceSort;
import com.assignment.softwarepatterns.sorting.DescendingPriceSort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
@SuppressWarnings("Duplicates")
public class ProductController {



	@RequestMapping(value = "/getallproductsascendingprice",
					method = RequestMethod.GET,
	        produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Product> getAllProducts() {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("Dyson", "Hoover", 13.24));
		products.add(new Product("Dyson", "Hoover2", 15.23));
		products.add(new Product("Dyson", "Hoover3", 20.23));
		products.add(new Product("Dyson", "Hoover4", 1.45));

		return new AscendingPriceSort().implementSortingAlgorithm(products);
	}

	@RequestMapping(value = "/getallproductsdescendingprice",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Product> getDescAllProducts() {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("Dyson", "Hoover", 13.24));
		products.add(new Product("Dyson", "Hoover2", 15.23));
		products.add(new Product("Dyson", "Hoover3", 20.23));
		products.add(new Product("Dyson", "Hoover4", 1.45));

		return new DescendingPriceSort(products).implementSortingAlgorithm(products);
	}
}
