package com.espire.library.designpatterns.builderfacade;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder address(String address) {
        person.address = address;
        return this;
    }

    public PersonAddressBuilder postcode(String postcode) {
        person.postcode = postcode;
        return this;
    }

    public PersonAddressBuilder city(String city) {
        person.city = city;
        return this;
    }

}
