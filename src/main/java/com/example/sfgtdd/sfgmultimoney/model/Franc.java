package com.example.sfgtdd.sfgmultimoney.model;

public class Franc extends Currency {

    public Franc(int amount) {
        super(amount);
    }

    public Franc multiply(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
    
}
