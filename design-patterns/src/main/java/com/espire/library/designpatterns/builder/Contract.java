package com.espire.library.designpatterns.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Contract {

    INTERN("Intern"),
    SOFTWARE_ENGINEER("Software Engineer"),
    TESTER("Tester"),
    SENIOR_SOFTWARE_ENGINEER("Sr Software Engineer"),
    LEAD("Lead");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
