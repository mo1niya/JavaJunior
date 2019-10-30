package ru.perepelitsina.part1.lesson25.task2;

import java.util.Map;

//Реализовать класс корзины интернет магазина по следующему интерфейсу, используя реализацию мапы:
//interface Basket {
//    void addProduct(String product, int quantity);
//    void removeProduct(String product);
//    void updateProductQuantity(String product, int quantity);
//    void clear();
//    List<String> getProducts();
//    int getProductQuantity(String product);}
public class App {
    public static void main(String[] args) {
        BasketImpl basketImpl = new BasketImpl();
        basketImpl.addProduct("Хлеб", 1);
        basketImpl.addProduct("Молоко", 1);
        basketImpl.addProduct("Сметена", 1);
        basketImpl.addProduct("Хлеб", 2);
        basketImpl.addProduct("Сметена", 3);
        basketImpl.addProduct("Молоко", 5);
        printPr(basketImpl);
        basketImpl.removeProduct("Хлеб");
        System.out.println("Удален хлеб");
        printPr(basketImpl);
        System.out.println("Количество: Молоко - " + basketImpl.getProductQuantity("Молоко"));
        System.out.println("Сlear");
        basketImpl.clear();
        printPr(basketImpl);
    }
    static void printPr(BasketImpl basketImpl){
        for (Map.Entry<String, Integer> entry: basketImpl.getProducts().entrySet()){
            System.out.printf("%s, %d%n", entry.getKey(), entry.getValue());
        }
    }
}
