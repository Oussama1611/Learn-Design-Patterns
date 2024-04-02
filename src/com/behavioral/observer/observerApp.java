package com.behavioral.observer;

public class observerApp {
    public static void main(String[] args)  {
        File helloObserver = new File();
        TailCommand tail1 = new TailCommand();
        TailCommand tail2 = new TailCommand();
        try {
            helloObserver.attach(tail1);
            helloObserver.attach(tail2);
        } catch (InterruptedException e){
            e.fillInStackTrace();
        }
        helloObserver.editFile("Hello Observer pattern !");
        helloObserver.editFile("How are you doing ?");
        try {
            helloObserver.detach(tail1);
        } catch (InterruptedException e){
            e.fillInStackTrace();
        }
        helloObserver.editFile("Goodbye");

    }
}
