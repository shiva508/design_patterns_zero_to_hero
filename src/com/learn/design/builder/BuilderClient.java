package com.learn.design.builder;

public class BuilderClient {
	public static void main(String[] args) {
		UserDetaiils detaiils = new UserDetaiils.UserDetaiilsBuilder("Shiva", "Nithya").setActive(false).build();
	}
}
