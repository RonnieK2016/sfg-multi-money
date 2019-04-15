package com.example.sfgtdd.sfgmultimoney.model;

public abstract class Currency {

    protected int amount;
    private String currencyName;

    public static Currency dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Currency franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public Currency(int amount, String currencyName) {
        this.amount = amount;
        this.currencyName = currencyName;
    }

    public abstract Currency multiply(int multiplier);

    public String getCurrencyName() {
        return currencyName;
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
