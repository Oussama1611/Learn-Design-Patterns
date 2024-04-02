package com.behavioral.state;

public class StateApp {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight trafficLight = new TrafficLight();

        LightState startingState = new RedState();
        trafficLight.setCurrentState(startingState);

        while(true){
            trafficLight.request();
        }


    }
}
