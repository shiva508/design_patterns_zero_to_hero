package com.pool.master.factory.simple.client;

import com.pool.master.factory.simple.model.Burger;
import com.pool.master.factory.simple.model.Hanburger;
import com.pool.master.factory.simple.servie.BurgerService;
import com.pool.master.factory.simple.servie.IndianBurgerService;

public class FactoryClient {
    public static void main(String[] args) {
        BurgerService burgerService = new IndianBurgerService();

        Hanburger hanburger = burgerService.ordeHanburger("Cheese");
    }
}
