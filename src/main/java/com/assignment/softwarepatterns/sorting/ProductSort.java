package com.assignment.softwarepatterns.sorting;

import com.assignment.softwarepatterns.models.Product;

import java.util.List;

public abstract class ProductSort {

	public final List<Product> sortProductsList(List<Product> products) {
		return checkForEmptyList(products);
	}

	public final List<Product> checkForEmptyList(List<Product> products) {
		if(products.isEmpty()) {
			return products;
		} else {
			return implementSortingAlgorithm(products);
		}
	}

	public abstract List<Product> implementSortingAlgorithm(List<Product> products);
}
