package com.espire.library.designpatterns.singleton;

import java.util.HashMap;

public class Printer {

    private static int count = 0;

    private Printer() {
        count++;
        System.out.println("Instance created " + count);
    }

    private static HashMap<Subsystem, Printer> instaces = new HashMap<>();

    public static Printer get(Subsystem subsystem) {
        if (instaces.containsKey(subsystem)) {
            return instaces.get(subsystem);
        }
        Printer instance = new Printer();
        instaces.put(subsystem, instance);
        return instance;
    }
}
