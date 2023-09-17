package com.pool.design.creational.builder.product;

public class Product {
	private String productName;
	private Double productPrce;
	private String productCode;
	private Boolean available;

	public String getProductName() {
		return productName;
	}

	public Double getProductPrce() {
		return productPrce;
	}

	public String getProductCode() {
		return productCode;
	}

	public Boolean getAvailable() {
		return available;
	}

	public static ProductBuilder builder() {
		return new ProductBuilder();
	}
	
	
	public static class ProductBuilder {
		Product product = new Product();

		public ProductBuilder setProductName(String productName) {
			this.product.productName = productName;
			return this;
		}

		public ProductBuilder setProductPrce(Double productPrce) {
			this.product.productPrce = productPrce;
			return this;
		}

		public ProductBuilder setProductCode(String productCode) {
			this.product.productCode = productCode;
			return this;
		}

		public ProductBuilder setAvailable(Boolean available) {
			this.product.available = available;
			return this;
		}

		public Product build() {
			return this.product;
		}
	}
}
