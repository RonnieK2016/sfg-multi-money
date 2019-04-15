package com.example.sfgtdd.sfgmultimoney.model;

public abstract class Currency {

    protected int amount;

    public static Currency dollar(int amount) {
        return new Dollar(amount);
    }

    public static Currency franc(int amount) {
        return new Franc(amount);
    }

    public Currency(int amount) {
        this.amount = amount;
    }

    public abstract Currency multiply(int multiplier);

    public int getAmount() {
        return amount;
    }

    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        return this.getClass().equals(object.getClass()) &&
                this.amount == ((Currency) object).getAmount();
    }
}
