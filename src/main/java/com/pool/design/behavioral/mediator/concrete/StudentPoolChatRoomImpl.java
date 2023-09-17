package com.pool.design.behavioral.mediator.concrete;

import java.util.HashMap;
import java.util.Map;

import com.learn.design.behavioral.mediator.StudentPoolChatRoom;
import com.learn.design.behavioral.mediator.colleague.Student;

public class StudentPoolChatRoomImpl implements StudentPoolChatRoom {

	private Map<String, Student> studentMap = new HashMap<>();

	@Override
	public void sendMessage(String msg, String userId) {
		Student student = studentMap.get(userId);
		student.receive(msg);

	}

	@Override
	public void addUser(Student student) {
		studentMap.put(student.getUserId(), student);

	}

}
