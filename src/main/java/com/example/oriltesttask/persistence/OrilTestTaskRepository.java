package com.example.oriltesttask.persistence;

import com.example.oriltesttask.model.TradeHistoryRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrilTestTaskRepository extends MongoRepository<TradeHistoryRecord, String> {

    List<TradeHistoryRecord> findBySymbol(String symbol);

}
