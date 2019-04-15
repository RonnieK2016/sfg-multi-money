package com.example.sfgtdd.sfgmultimoney.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrancTest {

    @Test
    public void multiply() {
        Currency franc = Currency.franc(5);
        assertEquals(Currency.franc(10), franc.multiply(2));
        assertEquals(Currency.franc(15), franc.multiply(3));
    }

    @Test
    public void getAmount() {
        Currency franc = Currency.franc(5);
        assertEquals(5, franc.getAmount());
    }

    @Test
    public void equals() {
        assertEquals(Currency.franc(5), Currency.franc(5));
    }

    @Test
    public void testCurrencyName() {
        assertEquals("CHF", Currency.franc(1).getCurrencyName());
    }
}