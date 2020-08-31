package com.task.example.model;

import javax.persistence.*;

@Entity
@Table(name = "stock")
public class SharedPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "symbol")
    String symbol;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    Double price;

    @Column(name = "exchange")
    String exchange;

    @Column(name = "time_stamp")
    String time_stamp;

    public SharedPrice(){

    }

    public SharedPrice(int id, String symbol, String name, Double price, String exchange, String time_stamp) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.exchange = exchange;
        this.time_stamp = time_stamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
