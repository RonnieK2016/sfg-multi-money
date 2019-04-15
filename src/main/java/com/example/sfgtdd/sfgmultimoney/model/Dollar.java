package com.example.sfgtdd.sfgmultimoney.model;

import java.util.Objects;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar multiply(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    public int getAmount() {
        return amount;
    }

    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        if(object instanceof Dollar) {
            return this.amount == ((Dollar) object).getAmount();
        }
        return false;
    }
}
