package com.pool.design.behavioral.mediator.colleague.concrete;

import com.learn.design.behavioral.mediator.StudentPoolChatRoom;
import com.learn.design.behavioral.mediator.colleague.Student;

public class ChatStudent extends Student {

	public ChatStudent(StudentPoolChatRoom mediator, String userId, String userName) {
		super(mediator, userId, userName);
	}

	@Override
	public void send(String msg, String userId) {
		System.out.println(this.getUserName() + " :: Sending Message : " + msg);
		getMediator().sendMessage(msg, userId);

	}

	@Override
	public void receive(String msg) {
		System.out.println(this.getUserName() + " :: Received Message : " + msg);
	}
}
