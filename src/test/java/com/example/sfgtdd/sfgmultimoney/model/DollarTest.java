package com.example.sfgtdd.sfgmultimoney.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DollarTest {

    @Test
    public void testMultiply() {
        Dollar dollar = new Dollar(5);
        dollar.multiply(2);

        assertEquals(10, dollar.getAmount());
    }
}
