package com.pool.design.behavioral.mediator.client;

import com.learn.design.behavioral.mediator.StudentPoolChatRoom;
import com.learn.design.behavioral.mediator.colleague.Student;
import com.learn.design.behavioral.mediator.colleague.concrete.ChatStudent;
import com.learn.design.behavioral.mediator.concrete.StudentPoolChatRoomImpl;

public class MediatorPatternClient {
	public static void main(String[] args) {
		StudentPoolChatRoom chatRoom = new StudentPoolChatRoomImpl();
		Student studentMtech = new ChatStudent(chatRoom, "508", "Shiva_Mtech");
		Student studentBtech = new ChatStudent(chatRoom, "408", "Shiva_Btech");
		Student studentInter = new ChatStudent(chatRoom, "28", "Shiva_Inter");

		// ADDING USER
		chatRoom.addUser(studentMtech);
		chatRoom.addUser(studentBtech);
		chatRoom.addUser(studentInter);

		studentMtech.send("Hi !,Shiva_BTECH, I'm from M.tech,here to find what went wrong in life", "408");
		studentBtech.send("Hi !,Shiva_MTECH, I was expecting you since longer than you were trying", "508");
	}
}
