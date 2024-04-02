package com.structural.bridge;

public class TV implements Device {
    @Override
    public void powerOn() {
        System.out.println("Turning on the TV");
    }

    @Override
    public void powerOff() {
        System.out.println("Turning off the TV");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Changing TV channel to " + channel);
    }
}