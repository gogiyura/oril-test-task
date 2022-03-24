package com.example.oriltesttask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cryptocurrencies")
public class Controller {

    @GetMapping
    public String get() {
        return "Hello, get request";
    }

    @GetMapping("minprice")
    public String getMinPrice() {
        return "min price";
    }

    @GetMapping("maxprice")
    public String getMaxPrice() {
        return "max price";
    }

}
