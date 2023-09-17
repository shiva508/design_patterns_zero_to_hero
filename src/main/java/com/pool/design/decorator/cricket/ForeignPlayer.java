package com.pool.design.decorator.cricket;

public class ForeignPlayer extends Player {
	
	

	public ForeignPlayer() {
		playerStack="Foreign Player";
	}

	@Override
	public Double soldAtAmmount() {
		return 2.6;
	}

}
