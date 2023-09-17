package com.pool.master.strategy.payment.controller;

import java.util.ArrayList;
import java.util.List;

import com.pool.master.strategy.payment.model.Product;

public class ShoppingCart {

    List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public int calculateTotalAmount() {
        var total = this.products.stream().mapToInt(Product::getPrice).sum();
        return total;
    }

    public void pay(Payment paymentStrategy) {
        int amount = calculateTotalAmount();
        paymentStrategy.pay(amount);
    }
}
