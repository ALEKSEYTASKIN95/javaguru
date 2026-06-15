package org.javaguru.student_aleksey_taskin.lesson_5.level_2;

public class LeapYearDetectorApp {

    public static void main(String[] args) {
        LeapYearDetector leapYearDetector = new LeapYearDetector();
        System.out.println(leapYearDetector.leapYearDetect(2024));
//        System.out.println(leapYearDetector.leapYearDetect(2028));
//        System.out.println(leapYearDetector.leapYearDetect(2032));
//        System.out.println(leapYearDetector.leapYearDetect(2036));
//        System.out.println(leapYearDetector.leapYearDetect(2040));
        System.out.println(leapYearDetector.leapYearDetect(2025));
        System.out.println(leapYearDetector.leapYearDetect(1900));
        System.out.println(leapYearDetector.leapYearDetect(2031));
        System.out.println();;
        System.out.println(leapYearDetector.leapYearDetect(1000));
        System.out.println(leapYearDetector.leapYearDetect(1001));
        System.out.println(leapYearDetector.leapYearDetect(1200));
        System.out.println(leapYearDetector.leapYearDetect(1300));
    }
}
