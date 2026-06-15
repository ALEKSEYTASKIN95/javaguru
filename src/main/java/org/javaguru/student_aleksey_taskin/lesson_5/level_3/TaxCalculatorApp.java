package org.javaguru.student_aleksey_taskin.lesson_5.level_3;

import java.math.BigDecimal;

public class TaxCalculatorApp {

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        System.out.println("Income 9000, tax = " + calculator.taxCalculate(new BigDecimal("9000")));
        System.out.println("Income 11000, tax = " + calculator.taxCalculate(new BigDecimal("11000")));
        System.out.println("Income 48000, tax = " + calculator.taxCalculate(new BigDecimal("48000")));
        System.out.println("Income 55000, tax = " + calculator.taxCalculate(new BigDecimal("55000")));
    }
}
