package com.creational.builder;

public class PizzaBuilder implements MealBuilder {
    private String sauce;
    private String dough;
    private String flavor;
    private String plate;

    @Override
    public PizzaBuilder addSauce(String sauce) {
        System.out.println("Preparing pizza with sauce " + sauce);
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder addDough(String dough) {
        System.out.println("Preparing pizza with dough " + dough);
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder addFlavor(String flavor) {
        System.out.println("Preparing pizza with flavor " + flavor);
        this.flavor = flavor;
        return this;
    }

    @Override
    public PizzaBuilder setPlate(String plate) {
        System.out.println("Putting pizza in " + plate);
        this.plate = plate;
        return this;
    }

    public Pizza build() {
        return new Pizza(sauce, dough, flavor, plate);
    }
}
