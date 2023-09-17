package com.pool.design.structural.adapter.ClassAdapter;

import com.pool.design.structural.adapter.Currency;
import com.pool.design.structural.adapter.CurrencyAdapter;
import com.pool.design.structural.adapter.StandardCurrencyRate;

public class ClassCurrencyAdapter extends StandardCurrencyRate implements CurrencyAdapter{

	@Override
	public Currency indianCurrency() {
		return getStandardCurrencyRate();
	}

	@Override
	public Currency russiaCurrency() {
		Currency currency=getStandardCurrencyRate();
		System.out.println("80:::::"+currency);
		return CurrencyAdapter.convertCurrencyByRate(currency,0.8);
	}

	@Override
	public Currency spainCurrency() {
		Currency currency=getStandardCurrencyRate();
		return CurrencyAdapter.convertCurrencyByRate(currency,0.9);
	}

	public Currency convertCurrencyByRate(Currency currency,Double currencyRate) {
		System.out.println("80::::"+currency.getCurrencyRate()*currencyRate);
		return new Currency(currency.getCurrencyRate()*currencyRate);
	}
}
