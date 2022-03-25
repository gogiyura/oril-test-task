package com.example.oriltesttask.controller;

import com.example.oriltesttask.model.TradeHistoryRecord;
import com.example.oriltesttask.service.OrilTestTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cryptocurrencies")
public class Controller {

    @Autowired
    private OrilTestTaskService service;

    @GetMapping
    public String get(
            @PathVariable String name,
            @PathVariable String page,
            @PathVariable String size
    ) {
        return name + page + size;
    }

    @GetMapping("minprice")
    public List<TradeHistoryRecord> getMinPrice(@PathVariable String name) {
        return service.findBySymbol(name);
    }

    @GetMapping("maxprice")
    public List<TradeHistoryRecord> getMaxPrice(@PathVariable String name) {

        return service.findBySymbol(name);
    }

    @GetMapping("csv")
    public String getCSV() {
        return "csv";
    }

}
