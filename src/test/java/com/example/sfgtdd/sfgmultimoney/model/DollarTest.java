package com.example.sfgtdd.sfgmultimoney.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DollarTest {

    @Test
    public void testMultiply() {
        Currency dollar = Currency.dollar(5);
        assertEquals(Currency.dollar(10), dollar.multiply(2));
        assertEquals(Currency.dollar(15), dollar.multiply(3));
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
    public void testPlusReturnsSum() {
        Currency five = Currency.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.getAugmend());
        assertEquals(five, sum.getAddmend());
    }

    @Test
    public void testReduceSum() {
        Expression sum = new Sum(Currency.dollar(3), Currency.dollar(4));
        Bank bank = new Bank();
        Currency result = bank.reduce(sum, "USD");
        assertEquals(Currency.dollar(7), result);
    }

    @Test
    public void testReduceMoney() {
        Bank bank = new Bank();
        Currency result = bank.reduce(Currency.dollar(1), "USD");
        assertEquals(Currency.dollar(1), result);
    }

    @Test
    public void testReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Currency result = bank.reduce(Currency.franc(2), "USD");
        assertEquals(Currency.dollar(1), result);
    }

    @Test
    public void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
        assertEquals(1, new Bank().rate("CHF", "CHF"));
    }

    @Test
    public void testMixedAddition() {
        Expression fiveBucks = Currency.dollar(5);
        Expression tenFrancs = Currency.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Currency result = bank.reduce(fiveBucks.plus(tenFrancs), "USD");
        assertEquals(Currency.dollar(10), result);
    }

    @Test
    public void testSumPlusMoney() {
        Expression fiveBucks = Currency.dollar(5);
        Expression tenFrancs = Currency.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(fiveBucks, tenFrancs).plus(fiveBucks);
        Currency result = bank.reduce(sum, "USD");
        assertEquals(Currency.dollar(15), result);
    }

    @Test
    public void testSumTimes() {
        Expression fiveBucks = Currency.dollar(5);
        Expression tenFrancs = Currency.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = new Sum(fiveBucks, tenFrancs).multiply(2);
        Currency result = bank.reduce(sum, "USD");
        assertEquals(Currency.dollar(20), result);
    }
}
