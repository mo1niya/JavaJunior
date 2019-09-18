package ru.perepelitsina.part1.lesson05;

import java.util.Date;

public class Check {
    private Date date = new Date();
    public Date getDate(){
        return date;
    }

    Product[] products;
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Check(Product[] products) {
        this.products = products;
    }
}
