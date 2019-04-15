package com.example.sfgtdd.sfgmultimoney.model;

public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void multiply(int multiplier) {
        this.amount *= multiplier;
    }

    public int getAmount() {
        return amount;
    }
}
