package org.javaguru.student_aleksey_taskin.lesson_5.level_5;

public class CompoundInterestCalculator {

    public double totalAmountCount(double initialAmount, double annualRate, int numberOfCharges,
                                   double placementPeriod) {
        return initialAmount * (Math.pow((1 + (annualRate / numberOfCharges)), (numberOfCharges * placementPeriod)));
    }
}

