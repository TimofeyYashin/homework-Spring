package com.example.spring.service;

import com.example.spring.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CatalogService {
    private final static List<Product> catalog = List.of(new Product(1, "Молоко"),
            new Product(2, "Хлеб"),
            new Product(3, "Сыр"),
            new Product(4, "Масло"),
            new Product(5, "Бана"),
            new Product(6, "Курица"),
            new Product(7, "Лимонад"),
            new Product(8, "Мороженое"));

    public Product findById(Long id) {
        return catalog.stream().filter(product -> product.getId() == id).findFirst().orElseThrow(() -> new RuntimeException("Товар не найден!!!"));
    }

    public List<Product> findByIds(List<Long> ids) {
        List<Product> items = new ArrayList<>();
        for (long id : ids) {
            items.add(findById(id));
        }
        return items;
    }
}


