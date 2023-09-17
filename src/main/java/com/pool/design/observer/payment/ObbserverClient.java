package com.pool.design.observer.payment;

public class ObbserverClient {
	public static void main(String[] args) {
		PaymentMaager maager = new PaymentMaager();
		PaymentListner logEvent = new PaymentEventLogger();
		maager.registerPaymentListner(logEvent);
		PaymentListner notification = new NotificationManager();
		maager.registerPaymentListner(notification);
		maager.pay();
	}
}
