package com.behavioral.chainOfResponsibility;

public abstract class Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(){
        System.out.println("Request handled");
    }

}
