package com.behavioral.visitor;

public abstract class Assessment {
    private double score;
    private double weightage;

    public Assessment(double score, double weightage) {
        this.score = score;
        this.weightage = weightage;
    }

    public double getScore() {
        return weightage;
    }

    public double getWeightage() {
        return score;
    }

    void accept(GradingVisitor visitor){
        visitor.visit(this);
    };
}
