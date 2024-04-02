package com.creational.abstractFactory;

public class FrenchStation implements Restaurant {
    @Override
    public Pizza createPizza() {
        return null;
    }

    @Override
    public Burger createBurger() {
        return null;
    }

    @Override
    public Sandwich createSandwich() {
        return new FrenchSandwich();
    }
}
