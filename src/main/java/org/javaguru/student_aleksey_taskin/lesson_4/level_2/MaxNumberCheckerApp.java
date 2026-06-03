package org.javaguru.student_aleksey_taskin.lesson_4.level_2;

public class MaxNumberCheckerApp {

    public static void main(String[] args) {
        MaxNumberChecker numberChecker = new MaxNumberChecker();
        System.out.println(numberChecker.maxNumberCheck(4,5));
        System.out.println(numberChecker.maxNumberCheck(4,4));
        System.out.println(numberChecker.maxNumberCheck(4,3));
        System.out.println(numberChecker.maxNumberCheck(500,3));
        System.out.println(numberChecker.maxNumberCheck(-500,3));
    }

}
