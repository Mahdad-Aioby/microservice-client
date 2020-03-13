package com.microservice.client.test.microservice.product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {


    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("1","p1"));
        products.add(new Product("2","p2"));

    }

    public Product get(String id) {

        Product p = products.stream().filter(product -> product.id.equals(id)).findAny().orElse(null);
        return p;
    }
}
