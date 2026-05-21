package org.javaguru.student_aleksey_taskin.lesson_2.level_3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(input + " * " + i + " = " + input * i);
        }
    }
}
