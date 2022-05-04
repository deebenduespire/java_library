package com.espire.library.designpatterns.srp;

public class Main {

    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.add("Test");

        Persistence persistence = new Persistence();
        String filename = "test.txt";
        persistence.save(journal, filename, true);
    }
}
