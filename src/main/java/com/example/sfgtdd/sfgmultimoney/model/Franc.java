package com.example.sfgtdd.sfgmultimoney.model;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc multiply(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    public int getAmount() {
        return amount;
    }

    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        if(object instanceof Franc) {
            return this.amount == ((Franc) object).getAmount();
        }
        return false;
    }
    
}
