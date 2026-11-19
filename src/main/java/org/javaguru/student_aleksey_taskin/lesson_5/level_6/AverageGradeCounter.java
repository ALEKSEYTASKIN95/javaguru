package org.javaguru.student_aleksey_taskin.lesson_5.level_6;

public class AverageGradeCounter {

    private StudentReportCard reportCard;

    public double averageGradeCount(StudentReportCard reportCard) {
        return (double) (reportCard.getGrade1() + reportCard.getGrade2()
                + reportCard.getGrade3() + reportCard.getGrade4()) / 4;
    }

}
