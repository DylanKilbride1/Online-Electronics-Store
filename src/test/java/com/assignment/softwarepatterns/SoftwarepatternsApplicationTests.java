package com.assignment.softwarepatterns;

import com.assignment.softwarepatterns.models.Product;
import com.assignment.softwarepatterns.sorting.AscendingPriceSort;
import com.assignment.softwarepatterns.sorting.DescendingPriceSort;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SoftwarepatternsApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
	public void checkIfSortWorks() {
		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("Dyson", "Hoover", 13.24));
		products.add(new Product("Dyson", "Hoover2", 15.23));
		products.add(new Product("Dyson", "Hoover3", 20.23));
		products.add(new Product("Dyson", "Hoover4", 1.45));

		//AscendingPriceSort ascendingPriceSort = new AscendingPriceSort(products);

		//ascendingPriceSort.implementSortingAlgorithm(products);

	}
}
