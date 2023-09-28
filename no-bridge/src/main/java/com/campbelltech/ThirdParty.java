package com.campbelltech;

import java.math.BigDecimal;

public class ThirdParty extends CarInsurance {
    protected ThirdParty(int year, String make, String model) {
        super(year, make, model);
    }

    @Override
    protected BigDecimal getPremium() {
        return new BigDecimal("50.00");
    }
}
