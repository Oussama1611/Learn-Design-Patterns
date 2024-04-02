package com.structural.bridge;

public class DVDPlayer implements Device {
    @Override
    public void powerOn() {
        System.out.println("Turning on the DVD player");
    }

    @Override
    public void powerOff() {
        System.out.println("Turning off the DVD player");
    }

    @Override
    public void setChannel(int channel) {
    }
}