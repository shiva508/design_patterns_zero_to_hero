package com.pool.design.creational.builder;

public class UserDetaiils {
	private String username;
	private String password;
	private boolean active;
	private boolean admin;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public boolean isActive() {
		return active;
	}

	public boolean isAdmin() {
		return admin;
	}

	private UserDetaiils(UserDetaiilsBuilder builder) {
		this.username = builder.username;
		this.password = builder.password;
		this.active = builder.active;
		this.admin = builder.admin;
	}

	public static class UserDetaiilsBuilder {
		private String username;
		private String password;
		private boolean active;
		private boolean admin;

		public UserDetaiilsBuilder(String username, String password) {
			super();
			this.username = username;
			this.password = password;
		}

		public UserDetaiilsBuilder setActive(boolean active) {
			this.active = active;
			return this;
		}

		public UserDetaiilsBuilder setAdmin(boolean admin) {
			this.admin = admin;
			return this;
		}

		public UserDetaiils build() {
			return new UserDetaiils(this);
		}
	}

}
