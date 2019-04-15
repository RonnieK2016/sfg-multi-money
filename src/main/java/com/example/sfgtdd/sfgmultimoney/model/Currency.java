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
        return this.getClass().equals(object.getClass()) &&
                this.amount == ((Currency) object).getAmount();
    }
}
