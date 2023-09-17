package com.pool.master.template.client;

import com.pool.master.template.service.Gane;
import com.pool.master.template.service.impl.EndlessRunner;
import com.pool.master.template.service.impl.FoodballGane;

public class GaneClient {
	public static void main(String[] args) {
		Gane ganeFoodball = new FoodballGane();
		ganeFoodball.play();
		Gane endless=new EndlessRunner();
		endless.play();
	}
}
