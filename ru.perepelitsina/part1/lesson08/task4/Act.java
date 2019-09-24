package ru.perepelitsina.part1.lesson08.task4;

public class Act {
    private int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    private String data;
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    private String[] products;
    public String[] getProducts() {
        return products;
    }
    public void setProducts(String[] products) {
        this.products = products;
    }

    Act(int num, String d, String[] pr){
        this.number = num;
        this.data = d;
        this.products = pr;
    }
}
