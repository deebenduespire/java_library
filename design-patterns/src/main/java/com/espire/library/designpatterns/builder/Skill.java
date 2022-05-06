package com.espire.library.designpatterns.builder;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Skill {

    JAVA("Java Developer"),
    PYTHON("Python Developer"),
    JMETER("JMeter Tester"),
    DEVOPS("DevOps Engineer"),
    PHP("PHP Developer");

    private final String value;

    @Override
    public String toString() {
        return value;
    }
}
