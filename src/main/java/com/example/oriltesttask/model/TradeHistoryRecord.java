package com.example.oriltesttask.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Document
public class TradeHistoryRecord {
    @Id
    private final String id;
    private final String symbol;
    private final String type;
    private final String date;
    private final String amount;
    private final String tid;

}
