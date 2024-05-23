package com.example.spring;

import lombok.Data;


@Data
public class Product {
    private long Id;
    private String name;

    public Product(long id, String name) {
        this.Id = id;
        this.name = name;
    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }
}
