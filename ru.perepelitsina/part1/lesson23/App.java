package ru.perepelitsina.part1.lesson23;

import java.util.List;

public class App {
    public static void main(String[] args) {
        BasketClass basketClass = new BasketClass();
        basketClass.addProduct("Хлеб", 1);
        basketClass.addProduct("Молоко", 1);
        basketClass.addProduct("Сметена", 1);
        basketClass.addProduct("Хлеб", 2);
        basketClass.addProduct("Сметена", 3);
        basketClass.addProduct("Молоко", 5);
        printPr(basketClass);
        basketClass.removeProduct("Хлеб");
        System.out.println("Удален хлеб");
        printPr(basketClass);
        System.out.println("Сlear");
        basketClass.clear();
        printPr(basketClass);
    }
    static void printPr(BasketClass basketClass){
        for (String str: basketClass.getProducts()){
            System.out.printf("%s, %d%n", str, basketClass.getProductQuantity(str));
        }
    }
}
