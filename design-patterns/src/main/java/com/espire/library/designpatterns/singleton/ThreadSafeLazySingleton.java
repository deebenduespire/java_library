package com.espire.library.designpatterns.singleton;

public class ThreadSafeLazySingleton {

    private static volatile ThreadSafeLazySingleton instance;

    private ThreadSafeLazySingleton() {
        // Protect against instantiation via reflection
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }
    public static synchronized ThreadSafeLazySingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazySingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeLazySingleton();
                }
            }
        }
        return instance;
    }
}
