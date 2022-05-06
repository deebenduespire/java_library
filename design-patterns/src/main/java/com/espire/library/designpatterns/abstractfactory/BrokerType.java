package com.espire.library.designpatterns.abstractfactory;

import com.espire.library.designpatterns.factory.Coin;
import com.espire.library.designpatterns.factory.CopperCoin;
import com.espire.library.designpatterns.factory.GoldCoin;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@Getter
@RequiredArgsConstructor
public enum BrokerType {

    ACTIVEMQ(ActiveMQFactory::new),
    KAFKA(KafkaFactory::new);

    private final Supplier<Broker> constructor;
}
