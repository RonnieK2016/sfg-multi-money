package com.example.sfgtdd.sfgmultimoney.model;

import java.util.Objects;

public class Dollar extends Currency {

    public Dollar(int amount, String currencyName) {
        super(amount, currencyName);
    }

    public Currency multiply(int multiplier) {
        return Currency.dollar(amount * multiplier);
    }
}
