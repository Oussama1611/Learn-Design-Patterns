package com.behavioral.momento;

import java.util.Stack;

public class CareTaker {
    private final Stack<Memento> mementos;

    public CareTaker(){
        this.mementos = new Stack<>();
    }

    public void addMemento(Memento memento){
        this.mementos.push(memento);
    }

    public Memento popMemento(){
        return this.mementos.pop();
    }
}
