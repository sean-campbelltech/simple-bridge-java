package com.campbelltech;

import java.math.BigDecimal;

// RefinedAbstraction2
public class ThirdPartyCarInsurance extends CarInsurance {
    protected ThirdPartyCarInsurance(int year, String make, String model, Discount discount) {
        super(year, make, model, discount);
    }

    @Override
    protected BigDecimal getPremium() {
        return new BigDecimal("50.00");
    }
}
