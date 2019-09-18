package ru.perepelitsina.part1.lesson05;

public abstract class Product {
    private String title;
    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    private float price;
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    private int quantity;
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float setCost(){
        float Cost = quantity*price;
        return Cost;
    }
    public float getCost(){
        return setCost();
    }

    Product(String title, float price, int quantity){
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }
}
