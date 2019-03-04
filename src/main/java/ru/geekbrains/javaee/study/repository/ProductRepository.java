package ru.geekbrains.javaee.study.repository;

import ru.geekbrains.javaee.study.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            products.add(new Product()
            .setId((long) i)
            .setName("Product-" + i)
            .setPrice((long) (i * 100))
            .setDescription("This is product " + i));
        }
    }

    public List<Product> findAll() {
        return products;
    }

    public Product find(Long id) {
        return products.get(Math.toIntExact(id));
    }
}
