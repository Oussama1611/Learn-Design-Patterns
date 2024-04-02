package com.behavioral.visitor;

import java.time.LocalDate;

public class Assignment extends Assessment{

    private LocalDate deadline;

    public Assignment(double score, double weightage, LocalDate deadline) {
        super(score, weightage);
        this.deadline = deadline;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
