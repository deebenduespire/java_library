package com.espire.library.designpatterns.abstractfactory;

public class ActiveMQFactory implements Broker {


    @Override
    public Consumer createConsumer() {
        return null;
    }

    @Override
    public Producer createProducer() {
        return null;
    }
}
