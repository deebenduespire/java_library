package com.espire.library.designpatterns.abstractfactory;

import com.espire.library.designpatterns.factory.Coin;
import com.espire.library.designpatterns.factory.CoinType;

public class BrokerFactory {

    public static Broker getBroker(BrokerType type) {
        return type.getConstructor().get();
    }
}
