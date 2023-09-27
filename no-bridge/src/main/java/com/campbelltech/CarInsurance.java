package com.campbelltech;

import java.math.BigDecimal;

public abstract class CarInsurance {
    private final int year;
    private final String make;
    private final String model;

    protected CarInsurance(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
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

    protected abstract BigDecimal getPremium();
}
