package com.espire.library.designpatterns.srp;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void add(String text) {
        entries.add("" + (++count) + " : " + text);
    }

    public void remove(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append(getClass().getName()).append("[ ");
        entries.forEach(value -> builder.append("{")
                .append(value)
                .append("}")
        );
        builder.append(" ]");
        return builder.toString();
    }

}
