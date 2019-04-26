package com.assignment.softwarepatterns.payments;

import com.assignment.softwarepatterns.models.PaymentReceipt;

public class DebitCard implements PaymentStrategy{

	private String customerName;
	private String cardNumber;
	private String expiryDate;
	private String cvc;

	public DebitCard() {}

	public DebitCard(String customerName, String cardNumber, String expiryDate, String cvc) {
		this.customerName = customerName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvc = cvc;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCvc() {
		return cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	@Override
	public PaymentReceipt paymentOperation(double amount) {
		//Contact Debit card payment provider in real world here...
		return new PaymentReceipt("success");
	}
}