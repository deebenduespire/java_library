package com.espire.library.designpatterns.abstract_;

public interface Storage {

    Void put(String key, Object value);

    Object get(String key);
}
