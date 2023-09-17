package com.pool.design.observer.payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentMaager {
	// ISSUE WITH TIGHTLY CUPLING
	/*
	 * private PaymentEventLogger eventLogger = new PaymentEventLogger(); private
	 * NotificationManager manager = new NotificationManager();
	 */

	List<PaymentListner> listners = new ArrayList<>();

	public void pay() {
		/*
		 * eventLogger.logEvent(); manager.sendNotification();
		 */
		listners.forEach(PaymentListner::ammountPaid);
	}

	public void registerPaymentListner(PaymentListner listner) {
		listners.add(listner);
	}

	public void unRegisterPaymentListner(PaymentListner listner) {
		listners.remove(listner);
	}

}
