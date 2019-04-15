package com.example.sfgtdd.sfgmultimoney.model;

public class Sum implements Expression {

    private Currency augmend;
    private Currency addmend;

    public Sum(Currency augmend, Currency addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    public Currency reduce(Bank bank, String to) {
        int amount = augmend.amount + addmend.amount;
        return new Currency(amount, to);
    }

    public Currency getAugmend() {
        return augmend;
    }

    public Currency getAddmend() {
        return addmend;
    }
}
