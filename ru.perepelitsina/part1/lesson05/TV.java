package ru.perepelitsina.part1.lesson05;

public class TV extends Product {
    private String color;
    public String getColor() {
        return color;
    }

    TV(String title, String color, float price, int quantity){
        super(title, price, quantity);
        this.color = color;
    }
}
