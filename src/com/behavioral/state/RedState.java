package com.behavioral.state;

public class RedState extends LightState{

    public RedState() {
        System.out.println("\u001B[31m" + "Switch to red" + "\u001B[0m");
    }

    @Override
    public LightState handle() throws InterruptedException {
        Thread.sleep(10 * 1000);
        return new GreenState();
    }
}
