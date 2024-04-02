package com.structural.flyweight;

public class Wheel implements CarComponent {
    private final String design;

    public Wheel(String design) {
        this.design = design;
    }

    @Override
    public void assemble(String color) {
        System.out.println("Assembling " + color + " " + design + " wheel");
    }
}