package org.javaguru.student_aleksey_taskin.lesson_5.level_1.task_2;

public class ColorDetectorApp {

    public static void main(String[] args) {
        ColorDetector colorDetector = new ColorDetector();
        System.out.println(colorDetector.colorDetect(123));
        System.out.println(colorDetector.colorDetect(500));
        System.out.println(colorDetector.colorDetect(1000));
        System.out.println(colorDetector.colorDetect(600));
    }
}
