package org.espire.library.oopsconcepts.polymorphism.methodoverriding;

public class Seller {
    public double sellProduct(int qty) {
        double total = qty * 10000;
        return total;
    }
}
