package com.structural.flyweight;

public class Engine implements CarComponent {
    private final String type;

    public Engine(String type) {
        this.type = type;
    }

    @Override
    public void assemble(String color) {
        System.out.println("Assembling " + color + " " + type + " engine");
    }
}