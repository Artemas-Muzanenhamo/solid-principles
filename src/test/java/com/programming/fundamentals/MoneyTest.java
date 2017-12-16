package com.programming.fundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MoneyTest {

    @Test
    public void dispenseFunds(){
        Money balance = new Money(1.0);
        Money request = new Money(3.0);

        assertEquals(true, balance.getValue() > request.getValue());
    }

}
