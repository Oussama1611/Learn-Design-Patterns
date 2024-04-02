package com.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    List<Colleague> colleagues;

    public Mediator(){
        colleagues = new ArrayList<>();
    }
    public void broadcast(Colleague colleague, String message) throws InterruptedException {
        colleague.send(message);
        colleagues.forEach(colleague1 ->
        {
            if (!colleague.equals(colleague1))
                colleague1.receive(message);
        });
        Thread.sleep(5*1000);
    }

    public void addMember(Colleague colleague) {
        colleagues.add(colleague);
    }
}
