package com.espire.library.designpatterns.ocp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("Apple", Color.GREEN, Size.LARGE);
        Product product2 = new Product("Banana", Color.RED, Size.SMALL);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        ProductFilter filter = new ProductFilter();
        filter.filter(products, new ColorSpecification(Color.GREEN)).forEach((product) -> System.out.println("Color is green"));
    }
}
