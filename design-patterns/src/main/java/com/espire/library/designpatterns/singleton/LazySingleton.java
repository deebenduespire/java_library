package com.espire.library.designpatterns.singleton;

/**
 * creating a lazy initialized singleton object in Java.
 */
public final class LazySingleton {

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }
}
