package org.espire.library.oopsconcepts.polymorphism.methodoverriding;

import org.espire.library.oopsconcepts.polymorphism.methodoverriding.Amazon;
import org.espire.library.oopsconcepts.polymorphism.methodoverriding.Flipkart;

public class Main {
    public static void main(String[] args) {
        Amazon trimmer = new Amazon();
        System.out.println("Trimmer price on Amazon is "+trimmer.sellProduct(4));

        Flipkart trimmer1 = new Flipkart();
        System.out.println("Trimmer price on Flipkart is "+trimmer1.sellProduct(4));

    }
}
