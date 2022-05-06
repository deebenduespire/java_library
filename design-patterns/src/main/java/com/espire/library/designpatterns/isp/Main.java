package com.espire.library.designpatterns.isp;

public class Main {

    public static void main(String[] args) {
        {
            CanonMF240 printer = new CanonMF240();
            printer.print(new Document());
            printer.scan(new Document());
        }

        {
            CanonMF245 printer = new CanonMF245();
            printer.fax(new Document());
            printer.print(new Document());
            printer.scan(new Document());
        }
    }
}
