package com.campbelltech;

import java.math.BigDecimal;

public class PropertyDamage extends CarInsurance {
    protected PropertyDamage(int year, String make, String model) {
        super(year, make, model);
    }

    @Override
    protected BigDecimal getPremium() {
        return new BigDecimal("60.00");
    }
}