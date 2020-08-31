package com.task.example.dto;

public class SharedPriceDto {

    private String symbol;
    private String name;
    private Double price;
    private String exchange;
    private String time_stamp;

    public SharedPriceDto() {

    }

    public SharedPriceDto(String symbol, String name, Double price, String exchange, String time_stamp) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.exchange = exchange;
        this.time_stamp = time_stamp;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getTimeStamp() {
        return time_stamp;
    }

    public void setTimeStamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }
}
