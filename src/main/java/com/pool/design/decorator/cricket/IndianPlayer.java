package com.pool.design.decorator.cricket;

public class IndianPlayer extends Player {

	public IndianPlayer() {
		playerStack = "Indian player";
	}

	@Override
	public Double soldAtAmmount() {
		return 5.0;
	}

}
