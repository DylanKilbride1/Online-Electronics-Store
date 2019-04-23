package com.assignment.softwarepatterns.services;

import com.assignment.softwarepatterns.models.Product;
import com.assignment.softwarepatterns.sorting.AscendingPriceSort;
import com.assignment.softwarepatterns.sorting.DescendingPriceSort;
import com.assignment.softwarepatterns.sorting.ProductSort;

import java.util.List;

public class ProductService {

	public List<Product> getAllProducts(String sortType) {

	}

	private List<Product> getProductsAscendingByPrice(List<Product> products) {
		ProductSort sortedProducts = new AscendingPriceSort();
		return sortedProducts.sortProductsList(products);

	}

	private List<Product> getProductsDescendingByPrice(List<Product> products) {
		ProductSort sortedProducts = new DescendingPriceSort();
		return sortedProducts.sortProductsList(products);
	}
}
