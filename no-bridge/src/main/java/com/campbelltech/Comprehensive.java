package com.campbelltech;

import java.math.BigDecimal;

// RefinedAbstraction1
public class Comprehensive extends CarInsurance {
    protected Comprehensive(int year, String make, String model) {
        super(year, make, model);
    }

    @Override
    protected BigDecimal getPremium() {
        return new BigDecimal("165.00");
    }
}
