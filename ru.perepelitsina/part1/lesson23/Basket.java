package ru.perepelitsina.part1.lesson23;

import java.util.List;

//Реализовать класс корзины интернет магазина по следующему интерфейсу:
public interface Basket {
    void addProduct(String product, int quantity);
    void removeProduct(String product);
    void updateProductQuantity(String product, int quantity);
    void clear();
    List<String> getProducts();
    int getProductQuantity(String product);
}
