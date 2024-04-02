package com.creational.factory;

public class FactoryApp {
    public static void main(String[] args) {
        Burger burger = Restaurant.createBurger(null);
        burger.assemble();
        Burger cheeseBurger = Restaurant.createBurger(BurgerType.CHEESE);
        cheeseBurger.assemble();

    }

}
