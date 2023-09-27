package com.campbelltech;

// ConcreteImplementorB
public class NoClaimsDiscount extends Discount {
    @Override
    public int getDiscount() {
        return 15;
    }
}
