package com.creational.builder;

public class Pizza {
    public Pizza(String sauce, String dough, String flavor, String plate){
        System.out.println("Deliver pizza with "+sauce+" sauce, "
                +dough+" dough and "+flavor+" flavor in a "+plate);
    }
}
