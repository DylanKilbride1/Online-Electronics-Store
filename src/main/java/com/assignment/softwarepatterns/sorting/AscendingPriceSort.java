package com.assignment.softwarepatterns.sorting;

import com.assignment.softwarepatterns.models.Product;

import java.util.*;

public class AscendingPriceSort extends ProductSort {

	@Override
	public List<Product> implementSortingAlgorithm(List<Product> products) {
		List<Product> sortedProducts = new ArrayList<>(products);
		sortedProducts.sort(Comparator.comparingDouble(Product::getPrice));
		return sortedProducts;
	}

}
