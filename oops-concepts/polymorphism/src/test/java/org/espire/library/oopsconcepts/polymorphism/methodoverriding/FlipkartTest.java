package org.espire.library.oopsconcepts.polymorphism.methodoverriding;

import org.espire.library.oopsconcepts.polymorphism.methodoverriding.Flipkart;
import org.espire.library.oopsconcepts.polymorphism.methodoverriding.Seller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipkartTest extends Seller {
    private Seller trimmer;

    @BeforeEach
    void setUp() {
        trimmer = new Flipkart();
    }

    @Test
    void testSellProduct() {
        assertEquals(48000.0,trimmer.sellProduct(4));
    }
}