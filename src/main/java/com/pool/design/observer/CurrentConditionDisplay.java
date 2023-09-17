package com.pool.design.observer;

import com.pool.design.observer.newsletter.Observer;
import com.pool.design.observer.newsletter.Subject;

public class CurrentConditionDisplay implements Observer, DisplayUnit {

	private Float temperature;
	private Float humidity;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("");
	}

	@Override
	public void update(Float temperature, Float humidity, Float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		display();
	}

}
