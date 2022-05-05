package com.espire.library.designpatterns.lsp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rectangle implements Shape {

    protected int width;
    protected int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append(getClass().getName()).append("[ ");
        builder.append("Height : ").append(height);
        builder.append("Width : ").append(width);
        builder.append(" ]");
        return builder.toString();
    }
}
