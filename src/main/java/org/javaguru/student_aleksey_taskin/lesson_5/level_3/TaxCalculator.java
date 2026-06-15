package org.javaguru.student_aleksey_taskin.lesson_5.level_3;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculator {

    public BigDecimal taxCalculate (BigDecimal amountOfIncome) {
        BigDecimal tax = BigDecimal.ZERO;

       if (amountOfIncome.compareTo(new BigDecimal("10000")) < 0) {
           tax = amountOfIncome.multiply(new BigDecimal("0.30"))
                   .setScale(2, RoundingMode.HALF_UP);
       }

       if (amountOfIncome.compareTo(new BigDecimal("10000")) >= 0
            && amountOfIncome.compareTo(new BigDecimal("50000")) < 0) {
           BigDecimal tax10k = new BigDecimal("10000").multiply(new BigDecimal("0.30"));
           BigDecimal tax10kPlus = amountOfIncome.subtract(new BigDecimal("10000"))
                   .multiply(new BigDecimal("0.40"));
           tax = tax10k.add(tax10kPlus).setScale(2,RoundingMode.HALF_UP);
       }

       if (amountOfIncome.compareTo(new BigDecimal("50000")) > 0) {
           BigDecimal tax10k = new BigDecimal("10000").multiply(new BigDecimal("0.30"));
           BigDecimal tax40k = new BigDecimal("40000").multiply(new BigDecimal("0.40"));
           BigDecimal tax50kPlus = amountOfIncome.subtract(new BigDecimal("50000"))
                   .multiply(new BigDecimal("0.50"));
           tax = tax10k.add(tax40k).add(tax50kPlus).setScale(2, RoundingMode.HALF_UP);
       }

       return tax;
    }
}
