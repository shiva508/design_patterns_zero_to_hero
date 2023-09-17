package com.pool.design.creational.builder;

import java.util.Locale;

import com.learn.design.creational.builder.product.Product;

public class BuilderClient {
	public static void main(String[] args) {
		UserDetaiils detaiils = new UserDetaiils.UserDetaiilsBuilder("Shiva", "Nithya").setActive(false).build();
		System.out.println(detaiils.getUsername());
		Product product = Product.builder().setAvailable(true).setProductCode("pS-408").setProductName("Shirt").build();
		System.out.println(product.getProductCode());
	}
}