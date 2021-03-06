package com.espire.library.designpatterns.ocp;

public class ColorSpecification implements Specification<Product> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public Boolean isSatisfied(Product item) {
        return item.color == color;
    }
}
