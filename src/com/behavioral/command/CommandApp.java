package com.behavioral.command;

public class CommandApp {
    public static void main(String[] args) {
        Session session = new Session();
        ShellCommand command = new ShellCommand();
        command.setSession(session);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        invoker.operation();


    }
}
