package com.espire.library.designpatterns.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Project {

    JAVA_STANDARD_COE("Intern"),
    WMS_PORTAL("Software Engineer"),
    INTEGRATION("Tester");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
