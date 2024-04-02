package com.behavioral.visitor;

public class Project extends Assessment{
    private int totalMembers;

    public Project(double score, double weightage, int totalMembers) {
        super(score, weightage);
        this.totalMembers = totalMembers;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }
}
