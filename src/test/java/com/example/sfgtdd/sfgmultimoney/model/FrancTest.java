package com.example.sfgtdd.sfgmultimoney.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrancTest {

    @Test
    public void multiply() {
        Franc franc = new Franc(5);
        Franc doubleProduct = franc.multiply(2);
        assertEquals(10, doubleProduct.getAmount());

        Franc tripleProduct = franc.multiply(3);
        assertEquals(15, tripleProduct.getAmount());
    }

    @Test
    public void getAmount() {
        Franc franc = new Franc(5);
        assertEquals(5, franc.getAmount());
    }

    @Test
    public void equals() {
        assertEquals(new Franc(5), new Franc(5));
    }
}