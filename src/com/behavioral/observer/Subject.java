package com.behavioral.observer;

import java.util.List;

public abstract class Subject {
    protected List<Observer> observers;
    public abstract void attach(Observer observer) throws InterruptedException;
    public abstract void detach(Observer observer) throws InterruptedException;
    protected abstract void notifyObservers();
}
