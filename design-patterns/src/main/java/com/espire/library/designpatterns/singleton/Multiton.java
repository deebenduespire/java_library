package com.espire.library.designpatterns.singleton;

import java.util.HashMap;

public class Multiton {

    public static void main(String[] args) {
        Printer main = Printer.get(Subsystem.PRIMARY);
        Printer auxiliary = Printer.get(Subsystem.AUXILIARY);
        Printer fallback = Printer.get(Subsystem.FALLBACK);
        Printer fallback2 = Printer.get(Subsystem.FALLBACK);
        Printer fallback3 = Printer.get(Subsystem.FALLBACK);
        Printer fallback4 = Printer.get(Subsystem.FALLBACK);
    }
}
