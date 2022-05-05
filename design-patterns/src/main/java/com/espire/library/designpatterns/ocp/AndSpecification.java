package com.espire.library.designpatterns.ocp;

public class AndSpecification<T> implements Specification<T> {

    private Specification<T> first;
    private Specification<T> second;

    public AndSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}
