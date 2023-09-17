package com.pool.master.template.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.learn.master.template.service.Gane;

public class FoodballGane  extends Gane{
	@Override
	public void initialize() {
		System.out.println("FoodballGane game initializing....");
	}

	@Override
	public void startPlay() {
		System.out.println("FoodballGane game starting....");
	}

	@Override
	public void endPlay() {
		System.out.println("FoodballGane game end....");
	}

	@Override
	protected void addNewGameCharacterToGame() {
		System.out.println("Adding new chanrector to Endless game ....");
		String answer=getUserInput();
		if(!answer.equals("no")) {
			System.out.println("");
		}
	}

	private String getUserInput() {
		String answer=null;
		System.out.println("Would you like to add new charector ?");
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		try {
			answer=bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(answer==null) {
			answer="no";
		}
		return answer;
	}
	
}
