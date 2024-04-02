package com.creational.prototype;

public class BlueTShirt implements TShirt {

    public TShirt clone() {
        System.out.println("BlueTshirt cloned");
        return this;
    }
}
