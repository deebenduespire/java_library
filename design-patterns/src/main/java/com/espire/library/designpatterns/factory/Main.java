package com.espire.library.designpatterns.factory;

public class Main {

    public static void main(String[] args) {
        System.out.println("The alchemist begins his work.");
        var coin1 = CoinFactory.getCoin(CoinType.COPPER);
        var coin2 = CoinFactory.getCoin(CoinType.GOLD);
        System.out.println(coin1.getDescription());
        System.out.println(coin2.getDescription());
    }
}
