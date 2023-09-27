package com.campbelltech;

import java.math.BigDecimal;

// RefinedAbstraction1
public class ComprehensiveCarInsurance extends CarInsurance {
    protected ComprehensiveCarInsurance(int year, String make, String model, Discount discount) {
        super(year, make, model, discount);
    }

    @Override
    protected BigDecimal getPremium() {
        return new BigDecimal("165.00");
    }
}
