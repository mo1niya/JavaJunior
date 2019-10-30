package ru.perepelitsina.part1.lesson25.task2;

import java.util.Map;

//Реализовать класс корзины интернет магазина по следующему интерфейсу:
public interface Basket {
    void addProduct(String product, int quantity);
    void removeProduct(String product);
    void updateProductQuantity(String product, int quantity);
    void clear();
    Map<String, Integer> getProducts();
    int getProductQuantity(String product);
}
