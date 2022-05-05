package com.espire.library.designpatterns.lsp;

public class Square implements Shape {

    protected int size;

    public Square() {
    }

    public Square(int size) {
        this.size = size;
    }

    public int getArea() {
        return size * size;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append(getClass().getName()).append("[ ");
        builder.append("Size : ").append(size);
        builder.append(" ]");
        return builder.toString();
    }

}
