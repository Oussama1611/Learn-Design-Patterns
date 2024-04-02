package com.structural.bridge;

public class BridgeApp {
    public static void main(String[] args) {
        TV tv = new TV();
        DVDPlayer dvdPlayer = new DVDPlayer();

        RemoteControl tvRemote = new RemoteControlImpl(tv);
        RemoteControl dvdRemote = new RemoteControlImpl(dvdPlayer);

        tvRemote.turnOn();
        tvRemote.changeChannel(5);
        tvRemote.turnOff();

        dvdRemote.turnOn();
        dvdRemote.turnOff();
    }
}
