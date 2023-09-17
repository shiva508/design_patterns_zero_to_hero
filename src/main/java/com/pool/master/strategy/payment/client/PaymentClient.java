package com.pool.master.strategy.payment.client;

import com.pool.master.strategy.payment.controller.CreditcardAlgoritham;
import com.pool.master.strategy.payment.controller.PaypalAlgoritham;
import com.pool.master.strategy.payment.controller.ShoppingCart;
import com.pool.master.strategy.payment.model.Product;

public class PaymentClient {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product pants = new Product("123", 400);
        Product shirt = new Product("143", 300);

        shoppingCart.addProduct(pants);
        shoppingCart.addProduct(shirt);

        shoppingCart.pay(new PaypalAlgoritham("whocares@alian.com", "tandananane"));

        shoppingCart.pay(new CreditcardAlgoritham("Shiva", "1223232"));

    }
}
