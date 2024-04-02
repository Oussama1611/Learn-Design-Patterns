package com.structural.bridge;

public class RemoteControlImpl implements RemoteControl {
    private final Device device;

    public RemoteControlImpl(Device device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        device.powerOn();
    }

    @Override
    public void turnOff() {
        device.powerOff();
    }

    @Override
    public void changeChannel(int channel) {
        device.setChannel(channel);
    }
}