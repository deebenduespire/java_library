package org.espire.library.abstraction.wac;

public class HDFC extends Bank {
    double rateOfInterest(double amt) {
        amt = amt + amt * 0.05;
        return amt;
    }
}
