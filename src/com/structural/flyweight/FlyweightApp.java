package com.structural.flyweight;

public class FlyweightApp {
    public static void main(String[] args) {
        Car car1 = new Car("V6", new String[]{"Alloy", "Alloy", "Alloy", "Alloy"});
        Car car2 = new Car("V8", new String[]{"Alloy", "Alloy", "Alloy", "Steel"});

        car1.assemble("Red");
        car2.assemble("Blue");

        System.out.println(car1.getEngine() == car2.getEngine());    // not the same engine
        System.out.println(car1.getWheels()[3] == car2.getWheels()[3]);   // not the same 3rd wheel
        System.out.println(car1.getWheels()[0] == car2.getWheels()[0]);   // the same 1st wheel
    }
}

