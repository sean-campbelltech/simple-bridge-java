package com.campbelltech;

import java.math.BigDecimal;

public class ThirdPartyCarInsurance extends CarInsurance {
    protected ThirdPartyCarInsurance(int year, String make, String model) {
        super(year, make, model);
    }

    @Override
    protected BigDecimal getPremium() {
        return new BigDecimal("50.00");
    }
}
