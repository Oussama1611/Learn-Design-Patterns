package com.behavioral.visitor;

import java.time.LocalDate;

public class GradeCalculator implements GradingVisitor {

    private double examGrade = 0;
    private double assignGrade = 0;
    private double prjGrade = 0;

    public void visit(Assessment assessment) {

        if (assessment instanceof Assignment){
            assignGrade += assessment.getScore() * assessment.getWeightage();
            if (((Assignment) assessment).getDeadline().isBefore(LocalDate.now()))
                assignGrade*=0;
        }
        if (assessment instanceof Exam){
            examGrade += assessment.getScore() * assessment.getWeightage();
            if (((Exam) assessment).isOnline())
                examGrade-=2;
        }
        if (assessment instanceof Project){
            int n = ((Project) assessment).getTotalMembers();
            prjGrade += assessment.getScore()/n * assessment.getWeightage();
        }
    }

    public double getTotalGrade() {
        return examGrade + assignGrade + prjGrade;
    }
}
