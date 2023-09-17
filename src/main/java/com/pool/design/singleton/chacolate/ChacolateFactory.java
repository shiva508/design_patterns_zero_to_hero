package com.pool.design.singleton.chacolate;

public class ChacolateFactory {
	private boolean empty;
	private boolean boiled;

	private static ChacolateFactory chacolateFactoryInstance;

	private ChacolateFactory() {
		empty = true;
		boiled = false;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
		}
	}

	public void boil() {
		if (isEmpty() && isBoiled()) {
			boiled = true;
		}
	}

	public static ChacolateFactory chacolateFactoryInstance() {
		if (chacolateFactoryInstance == null) {
			synchronized (ChacolateFactory.class) {
				chacolateFactoryInstance=new ChacolateFactory();
			}
		}
		return chacolateFactoryInstance;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

	public void setBoiled(boolean boiled) {
		this.boiled = boiled;
	}

}
