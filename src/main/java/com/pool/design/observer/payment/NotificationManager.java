package com.pool.design.observer.payment;

public class NotificationManager implements PaymentListner {
	
	public void sendNotification() {
		System.out.println("Notification Sent");
	}

	@Override
	public void ammountPaid() {
		sendNotification();
	}
}
