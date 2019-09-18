package ru.perepelitsina.part1.lesson05;

public class Laptop extends Product {
    private String cpu;
    public String getCpu() {
        return cpu;
    }

    Laptop(String title, String cpu,  float price, int quantity){
        super(title, price, quantity);
        this.cpu = cpu;
    }
}
