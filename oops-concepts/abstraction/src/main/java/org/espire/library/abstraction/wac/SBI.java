package org.espire.library.abstraction.wac;

public class SBI extends Bank {
    double rateOfInterest(double amt) {
        amt = amt + (amt * 0.06);
        return amt;
    }
}
