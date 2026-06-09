package org.javaguru.student_aleksey_taskin.lesson_4.level_5;

public class CreditCardFeeApp {

    public static void main(String[] args) {
        CreditCardFeeCounter cardFeeCounter = new CreditCardFeeCounter();
        System.out.println("Сумма комиссии составит: " + cardFeeCounter.feeCount(6000));
        System.out.println("Сумма комиссии составит: " + cardFeeCounter.feeCount(5000));
        System.out.println("Сумма комиссии составит: " + cardFeeCounter.feeCount(1000));
    }
}
