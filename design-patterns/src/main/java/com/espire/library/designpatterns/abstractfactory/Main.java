package com.espire.library.designpatterns.abstractfactory;

import com.espire.library.designpatterns.factory.CoinFactory;
import com.espire.library.designpatterns.factory.CoinType;

public class Main {

    public static void main(String[] args) {
        var activemq = BrokerFactory.getBroker(BrokerType.ACTIVEMQ);
        var kafka = BrokerFactory.getBroker(BrokerType.KAFKA);
    }
}
