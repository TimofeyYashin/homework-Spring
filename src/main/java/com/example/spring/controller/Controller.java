package com.example.spring.controller;

import com.example.spring.Product;
import com.example.spring.service.BucketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RequestMapping("/products")
@RestController
@Slf4j
public class Controller {
    @Autowired
    private BucketService bucketService;

    public Controller() {
    }


    @GetMapping(path = "/add")
    public void add(@RequestParam("ids") List<Long> ids) {
        bucketService.add(ids);
    }

    @GetMapping(path = "/get")
    public List<Product> get() {
        return bucketService.get();
    }
}
