package com.creational.builder;

public interface MealBuilder {
    MealBuilder addSauce(String sauce);
    MealBuilder addDough(String dough);
    MealBuilder addFlavor(String flavor);
    MealBuilder setPlate(String plate);
}
