package com.pool.master.template.service;

public abstract class Gane {
	public abstract void initialize();

	public abstract void startPlay();

	public abstract void endPlay();

	public final void play() {
		loadAssets();
		initialize();
		startPlay();
		endPlay();
		if (addNewGameCharector()) {
			addNewGameCharacterToGame();
		}
	}

	protected abstract void addNewGameCharacterToGame();

	public boolean addNewGameCharector() {
		return true;
	}

	public void loadAssets() {
		System.out.println("Loading all the required assets");
	}
}
