package com.example.sfgtdd.sfgmultimoney.model;

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
}
