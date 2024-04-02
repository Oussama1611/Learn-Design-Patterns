package com.creational.factory;

public class VeggieBurger extends Burger{
    @Override
    public void assemble() {
        System.out.println("Assembling a veggie burger");
    }
}
