package com.creational.abstractFactory;

public class ItalianStation implements Restaurant{
    @Override
    public Pizza createPizza() {
        return new ItalianPizza();
    }

    @Override
    public Burger createBurger() {
        return null;
    }

    @Override
    public Sandwich createSandwich() {
        return null;
    }
}
