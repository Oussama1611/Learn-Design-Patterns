package com.behavioral.state;

public class GreenState extends LightState {

    public GreenState() {
        System.out.println("\u001B[32m"+ "Switch to green"+ "\u001B[0m");
    }

    @Override
    public LightState handle() throws InterruptedException {
        Thread.sleep(8 * 1000);
        return new YellowState();
    }
}
