package com.espire.library.designpatterns.abstract_;

import java.util.Map;
import java.util.Objects;

public abstract class AbstractStorage implements Storage {

    private final Map<String, Object> properties;

    protected AbstractStorage(Map<String, Object> properties) {
        Objects.requireNonNull(properties, "properties map is required");
        this.properties = properties;
    }

    @Override
    public Void put(String key, Object value) {
        properties.put(key, value);
        return null;
    }

    @Override
    public Object get(String key) {
        return properties.get(key);
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append(getClass().getName()).append("[ ");
        properties.forEach((key, value) -> builder.append("{")
                .append(key)
                .append(" : ")
                .append(value)
                .append("}")
        );
        builder.append(" ]");
        return builder.toString();
    }
}
