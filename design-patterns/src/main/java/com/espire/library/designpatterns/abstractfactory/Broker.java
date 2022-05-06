package com.espire.library.designpatterns.abstractfactory;

public interface Broker {

    Consumer createConsumer();
    Producer createProducer();
}
