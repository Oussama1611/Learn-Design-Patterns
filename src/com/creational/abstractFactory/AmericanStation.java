package com.creational.abstractFactory;

public class AmericanStation implements Restaurant{
    @Override
    public Pizza createPizza() {
        return null;
    }

    @Override
    public Burger createBurger() {
        return new AmericanBurger();
    }

    @Override
    public Sandwich createSandwich() {
        return new AmericanSandwich();
    }
}
