package com.techgeek.kafka.avroschema.model;

import lombok.Data;

@Data
public class StockHistoryModel {
    private int tradeId;
    private int tradeQuantity;
    private String tradeMarket;
    private String stockName;
    private String tradeType;
    private float price;
    private float amount;
}
