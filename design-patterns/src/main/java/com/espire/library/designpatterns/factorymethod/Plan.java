package com.espire.library.designpatterns.factorymethod;

public abstract class Plan {

    protected double rate;

    abstract void getRate();

    public void calculate(int units) {
        System.out.println(units * rate);
    }
}
