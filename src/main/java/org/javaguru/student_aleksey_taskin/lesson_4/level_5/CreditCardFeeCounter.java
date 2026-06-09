package org.javaguru.student_aleksey_taskin.lesson_4.level_5;

class CreditCardFeeCounter {

    public double feeCount(double amountOfCash) {
        if (amountOfCash <= 1000) {
            return (amountOfCash * 3) / 100;
        } else if (amountOfCash > 1000 && amountOfCash <= 5000) {
            return (amountOfCash * 4) / 100;
        } else {
            return (amountOfCash * 5) / 100;
        }
    }
}
