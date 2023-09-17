package com.pool.design.creational.factory.notification;

public class NotificationClients {
	public static void main(String[] args) {
		Notification smsNotification = NotificationFactory.notify(NotificationType.SMS);
		smsNotification.sendNotification();
		Notification emailNotification = NotificationFactory.notify(NotificationType.EMAIL);
		emailNotification.sendNotification();
		Notification studentPoolNotification = NotificationFactory.notify(NotificationType.STUDENTPOOL);
		studentPoolNotification.sendNotification();

	}
}
