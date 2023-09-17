package com.pool.design.decorator.cricket;

public class Batman extends StackAdder {
	
	Player player;
	

	public Batman(Player player) {
		this.player = player;
	}

	@Override
	public String getPlayerStack() {
		return player.getPlayerStack()+",Batman";
	}

	@Override
	public Double soldAtAmmount() {
		if(player instanceof IndianPlayer) {
			return player.soldAtAmmount()+5.8;
		}else{
			return player.soldAtAmmount()+5.8;
		}
		
	}

}
