package org.espire.library.oopsconcepts.polymorphism.methodoverriding;

public class Flipkart extends Seller {
    public double sellProduct(int qty){
        double total = qty * 12000;
        return total;
    }
}
