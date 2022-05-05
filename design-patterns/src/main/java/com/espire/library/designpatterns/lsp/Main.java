package com.espire.library.designpatterns.lsp;

public class Main {

    public static void main(String[] args) {
        Shape square = new Square(10);
        System.out.println(square.getArea());

        Shape rectangle = new Rectangle(10, 30);
        System.out.println(rectangle.getArea());
    }
}
