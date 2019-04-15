package com.example.sfgtdd.sfgmultimoney.model;

public class Currency implements Expression {

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

    public Expression plus(Currency addend) {
        return new Sum(this, addend);
    }

    @Override
    public Currency reduce(Bank bank, String to){
        return new Currency(amount / bank.rate(this.getCurrencyName(), to), to);
}

    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        return this.currencyName.equals(((Currency) object).getCurrencyName()) &&
                this.amount == ((Currency) object).getAmount();
    }
}
