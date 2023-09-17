package com.pool.design.structural.adapter.ObjectAdapter;

import com.learn.design.structural.adapter.Currency;
import com.learn.design.structural.adapter.CurrencyAdapter;
import com.learn.design.structural.adapter.StandardCurrencyRate;

public class ObjectCurrencyAdapter implements CurrencyAdapter{
	private final StandardCurrencyRate standardCurrencyRate=new StandardCurrencyRate();

	@Override
	public Currency indianCurrency() {
		return standardCurrencyRate.getStandardCurrencyRate();
	}

	@Override
	public Currency russiaCurrency() {
		Currency currency=standardCurrencyRate.getStandardCurrencyRate();
		return CurrencyAdapter.convertCurrencyByRate(currency,0.8);
	}

	@Override
	public Currency spainCurrency() {
		Currency currency=standardCurrencyRate.getStandardCurrencyRate();
		return CurrencyAdapter.convertCurrencyByRate(currency,0.9);
	}

}
