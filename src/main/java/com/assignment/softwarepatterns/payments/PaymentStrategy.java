package com.assignment.softwarepatterns.payments;

import com.assignment.softwarepatterns.models.PaymentReceipt;

public interface PaymentStrategy {
	PaymentReceipt paymentOperation(double amount);
}
