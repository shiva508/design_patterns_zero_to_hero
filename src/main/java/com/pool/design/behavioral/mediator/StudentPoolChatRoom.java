package com.pool.design.behavioral.mediator;

import com.learn.design.behavioral.mediator.colleague.Student;

public interface StudentPoolChatRoom {
	public void sendMessage(String msg, String userId);

	public void addUser(Student student);
}
