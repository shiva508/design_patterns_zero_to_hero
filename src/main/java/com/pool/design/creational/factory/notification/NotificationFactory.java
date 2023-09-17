package com.pool.design.creational.factory.notification;

public class NotificationFactory {
	public static Notification notify(NotificationType notificationType) {

		Notification notification;
		switch (notificationType) {
		case SMS: 
			notification=new SMSNotification();
			break;
		case EMAIL:
			notification=new EMAILNotification();
			break;
		case STUDENTPOOL:
			notification=new STUDENTPOOLNotification();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + notificationType);
		}
		return notification;
	}
}
