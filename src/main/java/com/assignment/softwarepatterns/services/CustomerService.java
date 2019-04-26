package com.assignment.softwarepatterns.services;

import com.assignment.softwarepatterns.models.Customer;
import com.assignment.softwarepatterns.models.PaymentReceipt;
import com.assignment.softwarepatterns.models.Product;
import com.assignment.softwarepatterns.payments.DebitCard;
import com.assignment.softwarepatterns.payments.PayPal;
import com.assignment.softwarepatterns.repositories.CustomerRepository;
import com.assignment.softwarepatterns.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class CustomerService {

	@Inject
	CustomerRepository customerRepository;
	@Autowired
	ProductRepository productRepository;

	public List<Customer> getAllCustomers() {
		return customerRepository.findAllCustomers();
	}

	public PaymentReceipt makePurchase(String paymentMethod, List<Product> productsToPurchase) {
		double totalPrice = 0;
		for (Product p: productsToPurchase) {
			totalPrice += p.getPrice();
			Product adjustStockToProduct = productRepository.findByManufacturerAndTitle(p.getManufacturer(), p.getTitle());
			adjustStockToProduct.setStock(adjustStockToProduct.getStock() - 1);
			productRepository.save(adjustStockToProduct);
		}

		switch (paymentMethod) {
			case "debit":
				return new DebitCard("Customer Name", "1111 2222 3333 4444", "05/20", "123").paymentOperation(totalPrice);
			case "paypal":
				return new PayPal("Customer Name", "Customer@email.com").paymentOperation(totalPrice);
		}
		return new PaymentReceipt("success");
	}
}
