package com.assignment.softwarepatterns.sorting;

import com.assignment.softwarepatterns.models.Product;

import java.util.ArrayList;
import java.util.List;

public class DescendingPriceSort extends ProductSort {

	@Override
	public List<Product> implementSortingAlgorithm(List<Product> products) {
		List<Product> sortedProducts = new ArrayList<>(products);
		sortedProducts.sort((product1, product2) -> Double.compare(product2.getPrice(), product1.getPrice()));
		return sortedProducts;
	}
}
