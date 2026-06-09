package org.javaguru.student_aleksey_taskin.lesson_4.level_3;

class MaxNumberChecker2 {

    public int maxNumberCheck (int number1, int number2, int number3) {
        if (number1 >= number2 && number1 >= number3) {
            return number1;
        } else if (number2 >= number1 && number2 >= number3) {
            return number2;
        } else {
            return number3;
        }
    }
}
