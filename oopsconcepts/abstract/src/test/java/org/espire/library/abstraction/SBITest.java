package org.espire.library.abstraction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SBITest {
    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new SBI();
    }

    @Test
    void testRateOfInterest() {
        assertEquals(5300.0,bank.rateOfInterest(5000));
    }
}