package com.espire.library.designpatterns.builderfacade;

public class Main {

    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                    .address("")
                    .address("")
                .works()
                    .company("")
                    .position("")
                .build();
    }
}
