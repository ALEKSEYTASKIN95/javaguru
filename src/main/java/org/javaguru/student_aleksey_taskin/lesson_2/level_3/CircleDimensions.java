package org.javaguru.student_aleksey_taskin.lesson_2.level_3;

import java.util.Scanner;

public class CircleDimensions {

    public static void main(String[] args) {
        double radiusCircle = new Scanner(System.in).nextDouble();
        double pi = Math.PI;
        double perimeter = 2 * pi * radiusCircle;
        double area = pi * radiusCircle * radiusCircle;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
// 31.41592653589793
// 78.53981633974483
