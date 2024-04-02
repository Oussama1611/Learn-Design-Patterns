package com.behavioral.command;

public class ShellCommand implements Command {
    Session session;
    @Override
    public void execute() {
        System.out.println("Command executed");
        session.operation();
    }

    public void setSession(Session session) {
        this.session = session;
    }
}
