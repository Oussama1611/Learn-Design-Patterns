package com.behavioral.visitor;

public class Exam extends Assessment{
    private boolean online;

    public Exam(double score, double weightage, boolean online) {
        super(score, weightage);
        this.online = online;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
