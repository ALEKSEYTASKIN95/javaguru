package org.javaguru.student_aleksey_taskin.lesson_4.level_2;

public class MinNumberCheckerApp {

    public static void main(String[] args) {
        MinNumberChecker numberChecker = new MinNumberChecker();
        System.out.println(numberChecker.minValueCheck(9, 900));
        System.out.println(numberChecker.minValueCheck(9, 9));
        System.out.println(numberChecker.minValueCheck(-9, 9));
        System.out.println(numberChecker.minValueCheck(90, 9));
        System.out.println(numberChecker.minValueCheck(0, 0));
        System.out.println(numberChecker.minValueCheck(0, 9));
    }

}
