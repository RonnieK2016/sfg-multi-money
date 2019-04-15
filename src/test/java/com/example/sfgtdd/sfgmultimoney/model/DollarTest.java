package com.example.sfgtdd.sfgmultimoney.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DollarTest {

    @Test
    public void testMultiply() {
        Dollar dollar = new Dollar(5);
        Dollar doubleProduct = dollar.multiply(2);
        assertEquals(10, doubleProduct.getAmount());

        Dollar tripleProduct = dollar.multiply(3);
        assertEquals(15, tripleProduct.getAmount());
    }

    @Test
    public void testEquals() {
        assertEquals(new Dollar(5), new Dollar(5));
    }

    @Test
    public void testNotEquals() {
        assertNotEquals(new Dollar(5), new Dollar(10));
        assertNotEquals(new Dollar(5), null);
    }
}
