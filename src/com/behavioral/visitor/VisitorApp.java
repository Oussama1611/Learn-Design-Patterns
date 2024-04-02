package com.behavioral.visitor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VisitorApp {
    public static void main(String[] args) {
        List<Assessment> assessments = new ArrayList<>();
        assessments.add(new Project(85, 0.2,4));
        assessments.add(new Assignment(90, 0.3, LocalDate.now().minusDays(0)));
        assessments.add(new Exam(80, 0.5, true));

        GradeCalculator gradeCalculator = new GradeCalculator();
        for (Assessment assessment : assessments) {
            assessment.accept(gradeCalculator);
        }

        double totalGrade = gradeCalculator.getTotalGrade();
        System.out.println("Total Grade: " + totalGrade);
    }
}
