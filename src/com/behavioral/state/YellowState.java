package com.behavioral.state;

public class YellowState extends LightState{

    public YellowState() {
        System.out.println("\u001B[33m"+"Switch to yellow"+"\u001B[0m");
    }

    @Override
    public LightState handle() throws InterruptedException {
        Thread.sleep(2 * 1000);
        return new RedState();
    }
}
