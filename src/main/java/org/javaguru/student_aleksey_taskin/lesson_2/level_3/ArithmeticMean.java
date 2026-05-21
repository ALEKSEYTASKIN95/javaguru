package org.javaguru.student_aleksey_taskin.lesson_2.level_3;

import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double sum = num1 + num2 + num3;
        System.out.println((sum / 3.0));

    }
}
