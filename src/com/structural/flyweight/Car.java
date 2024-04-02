package com.structural.flyweight;

public class Car {
    private final CarComponent engine;
    private final CarComponent[] wheels;

    public Car(String engineType, String[] wheelDesigns) {
        this.engine = CarComponentFactory.getEngine(engineType);
        this.wheels = new CarComponent[wheelDesigns.length];
        for (int i = 0; i < wheelDesigns.length; i++) {
            this.wheels[i] = CarComponentFactory.getWheel(wheelDesigns[i]);
        }
    }

    public void assemble(String color) {
        engine.assemble(color);
        for (CarComponent wheel : wheels) {
            wheel.assemble(color);
        }
        System.out.println("Assembling " + color + " car chassis and interior");
    }

    public CarComponent getEngine() {
        return engine;
    }

    public CarComponent[] getWheels() {
        return wheels;
    }
}