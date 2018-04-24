package com.github.machosmurf.gswbankieren.bank.account;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    Account testAccount1;

    @Before
    public void setUp() throws Exception {
        testAccount1 = new Account("RABO", null);
    }

    @Test
    public void getAccountNumber() {
        assertEquals("Expected account to be 10 chars long", 10, testAccount1.getAccountNumber().length());
        assertEquals("RABO expected as first 4 chars", "RABO", testAccount1.getAccountNumber().substring(0, 4));
    }

}