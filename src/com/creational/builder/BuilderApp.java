package com.creational.builder;

public class BuilderApp {

    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder.addDough("thin")
                .addFlavor("cheese")
                .addSauce("tomato")
                .setPlate("box")
                .build();
    }
}
