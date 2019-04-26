package com.assignment.softwarepatterns.payments;

import com.assignment.softwarepatterns.models.PaymentReceipt;

public class PayPal implements PaymentStrategy{

	private String customerName;
	private String email;

	public PayPal() {}

	public PayPal(String customerName, String email) {
		this.customerName = customerName;
		this.email = email;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public PaymentReceipt paymentOperation(double amount) {
		//Contact paypal api in real world here...
		return new PaymentReceipt("success");
	}
}