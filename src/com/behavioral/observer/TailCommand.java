package com.behavioral.observer;

public class TailCommand extends Observer {
    public String newText;

    public TailCommand() {
        super();
        newText = "";
    }

    @Override
    public void update() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("["+this.ID+"] File changed. New text @ " + newText + " @");
    }
}
