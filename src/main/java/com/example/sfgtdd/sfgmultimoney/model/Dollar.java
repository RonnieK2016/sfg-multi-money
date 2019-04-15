package com.example.sfgtdd.sfgmultimoney.model;

import java.util.Objects;

public class Dollar extends Currency {

    public Dollar(int amount) {
        super(amount);
    }

    public Dollar multiply(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }


}
