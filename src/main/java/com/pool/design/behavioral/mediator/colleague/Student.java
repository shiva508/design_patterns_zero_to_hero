package com.pool.design.behavioral.mediator.colleague;

import com.learn.design.behavioral.mediator.StudentPoolChatRoom;

public abstract class Student {
	private StudentPoolChatRoom mediator;
	private String userId;
	private String userName;

	public Student(StudentPoolChatRoom mediator, String userId, String userName) {
		this.mediator = mediator;
		this.userId = userId;
		this.userName = userName;
	}

	public StudentPoolChatRoom getMediator() {
		return mediator;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public abstract void send(String msg, String userId);

	public abstract void receive(String msg);
}
