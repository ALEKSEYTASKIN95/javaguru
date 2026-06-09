package org.javaguru.student_aleksey_taskin.lesson_4.level_3;

public class MaxNumberChecker2App {

    public static void main(String[] args) {
        MaxNumberChecker2 maxNumberChecker2 = new MaxNumberChecker2();
        System.out.println(maxNumberChecker2.maxNumberCheck(3,4,5));
        System.out.println(maxNumberChecker2.maxNumberCheck(3,4,4));
        System.out.println(maxNumberChecker2.maxNumberCheck(4,4,4));
        System.out.println(maxNumberChecker2.maxNumberCheck(4,4,3));
        System.out.println(maxNumberChecker2.maxNumberCheck(4,3,3));
        System.out.println(maxNumberChecker2.maxNumberCheck(0,0,0));
        System.out.println(maxNumberChecker2.maxNumberCheck(-3,0,1));
        System.out.println(maxNumberChecker2.maxNumberCheck(-3,10,1));
        System.out.println(maxNumberChecker2.maxNumberCheck(300,10,1));
        System.out.println(maxNumberChecker2.maxNumberCheck(300,100,1000000));
    }
}