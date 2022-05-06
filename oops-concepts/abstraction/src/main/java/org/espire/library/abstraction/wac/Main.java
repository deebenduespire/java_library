package org.espire.library.abstraction.wac;

public class Main {
    public static void main(String[] args) {
        int amt = 5000;
        Bank b1 = new SBI();
        System.out.println("Rate of interest in SBI on amount "+amt+" is "+b1.rateOfInterest(amt));

        Bank b2 = new HDFC();
        System.out.println("Rate of interest in HDFC on amount "+amt+" is "+b2.rateOfInterest(amt));
    }
}
