package com.pool.design.structural.adapter;

import com.learn.design.structural.adapter.ClassAdapter.ClassCurrencyAdapter;

public class CurrencyClient {
	public static void main(String[] args) {
		classBasedCurrecyAdapter();
	}

	private static void classBasedCurrecyAdapter() {
		CurrencyAdapter adapter=new ClassCurrencyAdapter();
		Currency indianCurrancy=getCurrancyByCountry(adapter,CURRENCYTYPE.INDIA);
		Currency russiaCurrancy=getCurrancyByCountry(adapter,CURRENCYTYPE.RUSSIA);
		System.out.println(indianCurrancy.getCurrencyRate());
		System.out.println(russiaCurrancy.getCurrencyRate());
	}

	private static Currency getCurrancyByCountry(CurrencyAdapter adapter, CURRENCYTYPE currencyType) {
		
		switch (currencyType) {
		case INDIA: 
			return adapter.indianCurrency();
		case RUSSIA:
			return adapter.russiaCurrency();
		case SPAIN:
			return adapter.spainCurrency();
		default:
			return adapter.indianCurrency();
		}
		
	}
}
