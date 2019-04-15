package com.example.sfgtdd.sfgmultimoney.model;

public class Franc extends Currency {

    public Franc(int amount, String currencyName) {
        super(amount, currencyName);
    }

    public Currency multiply(int multiplier) {
        return Currency.franc(amount * multiplier);
    }
    
}
