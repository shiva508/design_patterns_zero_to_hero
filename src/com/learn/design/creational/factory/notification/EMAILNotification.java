package com.learn.design.creational.factory.notification;

public class EMAILNotification implements Notification {

	@Override
	public void sendNotification() {
		System.out.println("EMAIL Notification");
	}

}
