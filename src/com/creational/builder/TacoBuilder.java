package com.creational.builder;

public class TacoBuilder implements MealBuilder {
    private String sauce;
    private String dough;
    private String flavor;
    private String plate;

    @Override
    public MealBuilder addSauce(String sauce) {
        System.out.println("Preparing Taco with sauce " + sauce);
        this.sauce = sauce;
        return this;
    }

    @Override
    public MealBuilder addDough(String dough) {
        System.out.println("Preparing Taco with dough " + dough);
        this.dough = dough;
        return this;
    }

    @Override
    public MealBuilder addFlavor(String flavor) {
        System.out.println("Preparing Taco with flavor " + flavor);
        this.flavor = flavor;
        return this;
    }

    @Override
    public MealBuilder setPlate(String plate) {
        System.out.println("Putting Taco in " + plate);
        this.plate = plate;
        return this;
    }

    public Taco build() {
        return new Taco(sauce, dough, flavor, plate);
    }
}
