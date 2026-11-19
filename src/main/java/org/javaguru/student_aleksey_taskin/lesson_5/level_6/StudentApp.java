package org.javaguru.student_aleksey_taskin.lesson_5.level_6;

public class StudentApp {

    public static void main(String[] args) {
        AverageGradeCounter counter = new AverageGradeCounter();
        StudentReportCard reportCard = new StudentReportCard(new Student("Taskin")
                , "Math", 4, 5, 4
                , 5);

        System.out.println(counter.averageGradeCount(reportCard));

    }
}
