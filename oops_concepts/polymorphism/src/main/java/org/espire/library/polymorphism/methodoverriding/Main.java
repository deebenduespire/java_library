package org.espire.library.polymorphism.methodoverriding;

public class Main {
    public static void main(String[] args) {
        Amazon trimmer = new Amazon();
        System.out.println("Trimmer price on Amazon is "+trimmer.sellProduct(4));

        Flipkart trimmer1 = new Flipkart();
        System.out.println("Trimmer price on Flipkart is "+trimmer1.sellProduct(4));

    }
}
