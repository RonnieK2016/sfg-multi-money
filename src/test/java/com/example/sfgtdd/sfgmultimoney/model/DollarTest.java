package com.example.sfgtdd.sfgmultimoney.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DollarTest {

    @Test
    public void testMultiply() {
        Currency dollar = Currency.dollar(5);
        assertEquals(10, dollar.multiply(2).getAmount());
        assertEquals(15, dollar.multiply(3).getAmount());
    }

    @Test
    public void testEquals() {
        assertEquals(Currency.dollar(5), Currency.dollar(5));
    }

    @Test
    public void testNotEquals() {
        assertNotEquals(Currency.dollar(5), Currency.dollar(10));
        assertNotEquals(Currency.dollar(5), null);
        assertNotEquals(Currency.dollar(5), Currency.franc(5));
    }

    @Test
    public void testCurrencyName() {
        assertEquals("USD", Currency.dollar(1).getCurrencyName());
    }

    @Test
    public void testSimpleAddition() {
        Currency five = Currency.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Currency reduced = bank.reduce(sum, "USD");
        assertEquals(Currency.dollar(10), reduced);
    }
}
