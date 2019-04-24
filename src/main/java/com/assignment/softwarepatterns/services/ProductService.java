package com.assignment.softwarepatterns.services;

import com.assignment.softwarepatterns.models.Product;
import com.assignment.softwarepatterns.repositories.ProductRepository;
import com.assignment.softwarepatterns.sorting.AscendingPriceSort;
import com.assignment.softwarepatterns.sorting.DescendingPriceSort;
import com.assignment.softwarepatterns.sorting.ProductSort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Product> getAllProducts(String sortType) {
		if(sortType.equals("ascending")) {
			return getProductsAscendingByPrice(productRepository.getAllProducts());
		} else if (sortType.equals("descending")){
			return getProductsDescendingByPrice(productRepository.getAllProducts());
		} else {
			return productRepository.getAllProducts();
		}
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