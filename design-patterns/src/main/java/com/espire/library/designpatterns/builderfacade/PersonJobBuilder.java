package com.espire.library.designpatterns.builderfacade;

public class PersonJobBuilder extends PersonBuilder {

    public PersonJobBuilder(Person person) {
        this.person = person;
    }

    public PersonJobBuilder company(String company) {
        this.person.company = company;
        return this;
    }

    public PersonJobBuilder position(String position) {
        this.person.position = position;
        return this;
    }
}
