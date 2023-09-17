package com.pool.design.observer.newsletter;

public interface Observer {
	public void update(Float temperature, Float humidity, Float pressure);
}
