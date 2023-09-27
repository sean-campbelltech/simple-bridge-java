package com.campbelltech;

import java.math.BigDecimal;

// Abstraction
public abstract class CarInsurance {
    private final int year;
    private final String make;
    private final String model;
    private final Discount discount;

    protected CarInsurance(int year, String make, String model, Discount discount) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.discount = discount;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    // operation
    public BigDecimal calculatePremium() {
        BigDecimal normalPrice = getPremium();
        return normalPrice.subtract(normalPrice.multiply(BigDecimal.valueOf(discount.getDiscount()).divide(BigDecimal.valueOf(100))));
    }

    protected abstract BigDecimal getPremium();
}
