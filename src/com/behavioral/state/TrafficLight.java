package com.behavioral.state;

public class TrafficLight {

    private LightState currentState;

    public void setCurrentState(LightState currentState) {
        this.currentState = currentState;
    }

    public void request() throws InterruptedException {
        this.currentState = this.currentState.handle();
    }
}
