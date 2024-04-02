package com.behavioral.mediator;

public class Member implements Colleague{
    public String name;

    public Member(String name){
        this.name = name;
    }

    @Override
    public void send(String message) {
        System.out.println(name+" sent : "+message);
    }

    @Override
    public void receive(String message) {
        System.out.println(name+" received : "+message);
    }
}
