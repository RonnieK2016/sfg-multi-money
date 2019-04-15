package com.example.sfgtdd.sfgmultimoney.model;

public class Sum implements Expression {

    private Expression augmend;
    private Expression addmend;

    public Sum(Expression augmend, Expression addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    public Currency reduce(Bank bank, String to) {
        int amount = augmend.reduce(bank, to).getAmount() + addmend.reduce(bank, to).getAmount();
        return new Currency(amount, to);
    }

    public Expression getAugmend() {
        return augmend;
    }

    public Expression getAddmend() {
        return addmend;
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }
}
