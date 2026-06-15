package org.javaguru.student_aleksey_taskin.lesson_5.level_2;

class LeapYearDetector {

    public boolean leapYearDetect(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeapYear = true;
            } else if (year % 400 == 0) {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
}