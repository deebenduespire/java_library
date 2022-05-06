package com.espire.library.designpatterns.abstractfactory;

public class KafkaFactory implements Broker {


    @Override
    public Consumer createConsumer() {
        return null;
    }

    @Override
    public Producer createProducer() {
        return null;
    }
}
