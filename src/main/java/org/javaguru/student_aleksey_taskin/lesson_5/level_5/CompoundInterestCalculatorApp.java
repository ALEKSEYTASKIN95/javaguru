package org.javaguru.student_aleksey_taskin.lesson_5.level_5;

public class CompoundInterestCalculatorApp {
    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        double totalAmount = calculator.totalAmountCount(100000, 0.15,
                1, 3);
        System.out.println(totalAmount);

    }
}
