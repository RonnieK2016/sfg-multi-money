package com.example.sfgtdd.sfgmultimoney.model;

public class Bank {

    Currency reduce(Expression source, String toCurrency) {
        return source.reduce(toCurrency);
    }
}
