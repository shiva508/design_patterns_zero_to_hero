package com.pool.design.structural.adapter;

public class Currency {
	private Double currencyRate;

	public Currency() {

	}

	public Currency(Double currencyRate) {
		this.currencyRate = currencyRate;
	}

	public Double getCurrencyRate() {
		return currencyRate;
	}

	public void setCurrencyRate(Double currencyRate) {
		this.currencyRate = currencyRate;
	}

	@Override
	public String toString() {
		return "Currency [currencyRate=" + currencyRate + "]";
	}
	
	
}
