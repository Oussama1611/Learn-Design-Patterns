package com.behavioral.command;

public class Invoker {
    Command command;
    public void operation() {
        System.out.println("Operation issued !");
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
