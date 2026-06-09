package org.javaguru.student_aleksey_taskin.lesson_5.level_1.task_1;

class IntegerStringConverter {

    public String convertIntegerToString(int inputNumber) {
        if (divideBy3(inputNumber) && divideBy5(inputNumber)) {
            return "FizzBuzz";
        } else if (divideBy5(inputNumber)) {
            return "Buzz";
        } else if (divideBy3(inputNumber)) {
            return "Fizz";
        } else {
            return "" + inputNumber;
        }
    }

    public boolean divideBy5 (int inputNumber) {
        return inputNumber % 5 == 0;
    }

    public boolean divideBy3 (int inputNumber) {
        return inputNumber % 3 == 0;
    }
}
