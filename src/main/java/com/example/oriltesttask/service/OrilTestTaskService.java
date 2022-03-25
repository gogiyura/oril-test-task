package com.example.oriltesttask.service;

import com.example.oriltesttask.model.TradeHistoryRecord;
import com.example.oriltesttask.persistence.OrilTestTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrilTestTaskService {

    @Autowired
    private OrilTestTaskRepository repository;

    public List<TradeHistoryRecord> findAll() {
        return repository.findAll();
    }

    public List<TradeHistoryRecord> findBySymbol(String symbol) {
        return repository.findBySymbol(symbol.toUpperCase());
    }
}
