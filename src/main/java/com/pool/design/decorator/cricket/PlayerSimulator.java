package com.pool.design.decorator.cricket;

public class PlayerSimulator {

	public static void main(String[] args) {
		Player indianPlayer=new IndianPlayer();
		System.out.println(indianPlayer.getPlayerStack());
		System.out.println(indianPlayer.soldAtAmmount());
		indianPlayer=new Batman(indianPlayer);
		System.out.println(indianPlayer.getPlayerStack());
		System.out.println(indianPlayer.soldAtAmmount());
	}

}
