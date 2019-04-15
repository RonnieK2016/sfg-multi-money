package com.example.sfgtdd.sfgmultimoney.model;

public interface Expression {

    Currency reduce(Bank bank, String to);

    Expression plus(Expression addend);
}
