package com.behavioral.momento;

public class Originator {

    private String content;

    public Memento createState(){
        return new Memento(this.content);
    }

    public void restore(Memento memento){
        this.content = memento.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
