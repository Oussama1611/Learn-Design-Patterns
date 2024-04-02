package com.behavioral.momento;

import com.behavioral.momento.CareTaker;
import com.behavioral.momento.Memento;
import com.behavioral.momento.Originator;

public class MementoApp {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        originator.setContent("Hello Memento");

        Memento memento1 = originator.createState();
        careTaker.addMemento(memento1);

        originator.setContent("How are you doing ?");

        Memento memento2 = originator.createState();
        careTaker.addMemento(memento2);

        originator.setContent("I am fine too");
        System.out.println(originator.getContent());

        Memento memento_restored = careTaker.popMemento();
        originator.restore(memento_restored);
        System.out.println(originator.getContent());

        memento_restored = careTaker.popMemento();
        originator.restore(memento_restored);
        System.out.println(originator.getContent());


    }
}