package com.campbelltech;

import java.math.BigDecimal;

public class SafeDriverComprehensive extends Comprehensive {
    protected SafeDriverComprehensive(int year, String make, String model) {
        super(year, make, model);
    }

    @Override
    protected BigDecimal getPremium() {
        return super.getPremium().multiply(new BigDecimal("0.90"));
    }
}
