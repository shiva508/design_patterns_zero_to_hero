package com.learn.design.factory.notification;

public class SMSNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("SMS Notification");
	}

}
