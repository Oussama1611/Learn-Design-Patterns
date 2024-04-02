package com.creational.factory;

public class Restaurant {
    static Burger createBurger(BurgerType type) {
        if (type == null)
            return new Burger();
        return switch (type) {
            case CHEESE -> new CheeseBurger();
            case VEGGIE -> new VeggieBurger();
            case CHICKEN -> new ChickenBurger();
        };
    }

}
