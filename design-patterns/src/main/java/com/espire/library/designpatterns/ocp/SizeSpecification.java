package com.espire.library.designpatterns.ocp;

public class SizeSpecification implements Specification<Product> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }


    @Override
    public Boolean isSatisfied(Product item) {
        return item.size == size;
    }
}
