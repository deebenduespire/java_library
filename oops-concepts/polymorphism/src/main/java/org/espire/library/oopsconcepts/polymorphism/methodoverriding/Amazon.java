package org.espire.library.oopsconcepts.polymorphism.methodoverriding;

public class Amazon extends Seller {
    public double sellProduct(int qty){
        double total = qty * 15000;
        return total;
    }
}
