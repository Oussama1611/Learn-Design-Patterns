package com.creational.abstractFactory;

public class AbstractFactoryApp {

    public static void main(String[] args) {
        Restaurant frenchCuisine = new FrenchStation();

        Sandwich frenshSandwich = frenchCuisine.createSandwich();


        Restaurant italianCuisine = new ItalianStation();

        Pizza italianPizza = italianCuisine.createPizza();



    }
}
