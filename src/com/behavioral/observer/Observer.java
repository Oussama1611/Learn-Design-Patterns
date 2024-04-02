package com.behavioral.observer;

public abstract class Observer {
    public final int ID;

    public Observer() {
        this.ID = (int) (Math.random() * 10000000) + 10000000;
    }

    public abstract void update() throws Exception;

    public boolean compare(Observer obs) {
        return this.ID == obs.ID ;
    }
}
