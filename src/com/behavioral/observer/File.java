package com.behavioral.observer;

import java.util.ArrayList;

public class File extends Subject {
    private String newText;

    public File() {
        this.observers = new ArrayList<>();
        newText = "";
    }

    @Override
    public void attach(Observer observer) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Observer attached : " + observer.ID);
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) throws InterruptedException {
        Thread.sleep(5000);
        boolean removed = this.observers.removeIf(obs -> obs.compare(observer));
        if (removed)  System.out.println("Observer detached : " + observer.ID);
        else  System.out.println("Observer not found");
    }

    @Override
    protected void notifyObservers() {
        for (Observer observer : this.observers) {
            try {
                if (observer instanceof TailCommand )
                    ((TailCommand) observer).newText = newText;
                observer.update();
            } catch (Exception e) {
                e.fillInStackTrace();
            }
        }
    }

    public void editFile(String text) {
        System.out.println("New Text Inserted : " + text);
        newText = text;
        notifyObservers();
    }
}
