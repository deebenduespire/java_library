package com.espire.library.designpatterns.ocp;

public interface Specification<T> {

    Boolean isSatisfied(T item);
}
