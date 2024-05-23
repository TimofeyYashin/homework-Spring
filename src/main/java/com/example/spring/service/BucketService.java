package com.example.spring.service;

import com.example.spring.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Service
@SessionScope
public class BucketService {
    private List<Product> bucket = new ArrayList<>();
    private final CatalogService catalogService;

    public BucketService(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    public void add(List<Long> ids) {
        List<Product> products = catalogService.findByIds(ids);
        bucket.addAll(products);
        System.out.println("Добавлены в корзину: {}" + products);
    }

    public List<Product> get() {
        return bucket;
    }
}
