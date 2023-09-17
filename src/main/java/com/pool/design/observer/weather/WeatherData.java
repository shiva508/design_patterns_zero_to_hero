package com.pool.design.observer.weather;

import java.util.ArrayList;
import java.util.List;

import com.learn.design.observer.newsletter.Observer;
import com.learn.design.observer.newsletter.Subject;

public class WeatherData implements Subject {
	
	private Float temperature;
	private Float humidity;
	private Float pressure;

	private List<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurements(Float temperature, Float humidity, Float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public String notifyObserver() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
		return null;
	}
}
