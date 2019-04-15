package com.example.sfgtdd.sfgmultimoney.model;

public class Currency {

    protected int amount;
    private String currencyName;

    public static Currency dollar(int amount) {
        return new Currency(amount, "USD");
    }

    public static Currency franc(int amount) {
        return new Currency(amount, "CHF");
    }

    public Currency(int amount, String currencyName) {
        this.amount = amount;
        this.currencyName = currencyName;
    }

    public Currency multiply(int multiplier) {
        return new Currency(this.amount * multiplier, this.currencyName);
    }

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
        return this.currencyName.equals(((Currency) object).getCurrencyName()) &&
                this.amount == ((Currency) object).getAmount();
    }
}
