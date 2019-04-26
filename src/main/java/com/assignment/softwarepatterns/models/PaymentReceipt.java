package com.assignment.softwarepatterns.models;

public class PaymentReceipt {

	private String success;

	public PaymentReceipt(String success) {
		this.success = success;
	}

	public PaymentReceipt() {

	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}
}
