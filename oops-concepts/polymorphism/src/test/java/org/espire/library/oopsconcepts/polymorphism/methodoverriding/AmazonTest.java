package org.espire.library.oopsconcepts.polymorphism.methodoverriding;

import org.espire.library.oopsconcepts.polymorphism.methodoverriding.Amazon;
import org.espire.library.oopsconcepts.polymorphism.methodoverriding.Seller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmazonTest extends Seller {
    private Seller trimmer;

    @BeforeEach
    void setUp() {
        trimmer = new Amazon();
    }

    @Test
    void testSellProduct() {
        assertEquals(60000.0,trimmer.sellProduct(4));
    }
}