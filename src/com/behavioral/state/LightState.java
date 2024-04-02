package com.behavioral.state;

public abstract class LightState {
    public LightState() {
    }
    public abstract LightState handle() throws InterruptedException;
}
