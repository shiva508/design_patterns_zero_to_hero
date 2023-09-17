package com.pool.master.template.service.impl;

import com.pool.master.template.service.Gane;

public class EndlessRunner extends Gane{

	@Override
	public void initialize() {
		System.out.println("Endless game initializing....");
	}

	@Override
	public void startPlay() {
		System.out.println("Endless game starting....");
	}

	@Override
	public void endPlay() {
		System.out.println("Endless game end....");
	}

	@Override
	protected void addNewGameCharacterToGame() {
		System.out.println("Adding new chanrector to Endless game ....");
	}

}
