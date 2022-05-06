package com.espire.library.designpatterns.builderfacade;

public class Person {

    public String address;
    public String postcode;
    public String city;

    public String company;
    public String position;
    public Integer annualIncome;

    @Override
    public String toString() {
        return "Person{" +
                "address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", annualIncome=" + annualIncome +
                '}';
    }
}
