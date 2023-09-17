package com.pool.design.creational.abstractfactory.cricket;

public class AbstractFactoryClient {
	public static void main(String[] args) {
		Cricketer lara = CricketerFactory.getCrickter(new LaraFactory("LARA", "400"));
		System.out.println(lara.getCsricketerName());
		System.out.println(lara.getTotalRuns());
		Cricketer sachine = CricketerFactory.getCrickter(new SachineFactory("SACCHINE", "GOD OF CRICKET"));
		System.out.println(sachine.getCsricketerName());
		System.out.println(sachine.getTotalRuns());
		Cricketer laxman = CricketerFactory.getCrickter(new LaxmanFactory("DemiGod Laxman", "Shows hell to apponets"));
		System.out.println(laxman.getCsricketerName());
		System.out.println(laxman.getTotalRuns());

	}
}
