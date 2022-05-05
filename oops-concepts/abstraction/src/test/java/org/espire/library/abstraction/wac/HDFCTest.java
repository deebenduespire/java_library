package org.espire.library.abstraction.wac;

import org.espire.library.abstraction.wac.Bank;
import org.espire.library.abstraction.wac.HDFC;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HDFCTest {
    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new HDFC();
    }

    @Test
    void testRateOfInterest() {
        assertEquals(5250.0,bank.rateOfInterest(5000));
    }

}