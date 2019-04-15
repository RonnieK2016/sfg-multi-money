package com.example.sfgtdd.sfgmultimoney.model;

public class Currency {

    protected int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        if(object instanceof Currency) {
            return this.amount == ((Currency) object).getAmount();
        }
        return false;
    }
}
