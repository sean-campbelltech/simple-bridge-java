package com.campbelltech;

import java.math.BigDecimal;

// RefinedAbstraction1
public class ComprehensiveCarInsurance extends CarInsurance {
    protected ComprehensiveCarInsurance(int year, String make, String model) {
        super(year, make, model);
    }

    @Override
    protected BigDecimal getPremium() {
        return new BigDecimal("165.00");
    }
}
