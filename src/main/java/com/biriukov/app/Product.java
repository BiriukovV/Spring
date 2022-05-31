package com.biriukov.app;

import java.math.BigDecimal;

public class Product {

    private int id;

    private String title;

    private int cost;

    public Product() {
    }

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
