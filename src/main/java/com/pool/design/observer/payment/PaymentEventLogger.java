package com.pool.design.observer.payment;

public class PaymentEventLogger implements PaymentListner {
	public void logEvent() {
		System.out.println("Payment Log Event");
	}

	@Override
	public void ammountPaid() {
		logEvent();
	}
}
