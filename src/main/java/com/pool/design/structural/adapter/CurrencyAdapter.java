package com.pool.design.structural.adapter;

public interface CurrencyAdapter {
	public Currency indianCurrency();

	public Currency russiaCurrency();

	public Currency spainCurrency();
	public static Currency convertCurrencyByRate(Currency currency,Double currencyRate) {
		System.out.println("80::::"+currency.getCurrencyRate()*currencyRate);
		return new Currency(currency.getCurrencyRate()*currencyRate);
	}
}
