package com.campbelltech;

import java.math.BigDecimal;

public class AutoOwnersThirdParty extends ThirdParty {
    protected AutoOwnersThirdParty(int year, String make, String model) {
        super(year, make, model);
    }

    @Override
    protected BigDecimal getPremium() {
        return super.getPremium().multiply(new BigDecimal("0.95"));
    }
}
