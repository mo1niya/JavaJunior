package ru.perepelitsina.part1.lesson05;

public class App {
    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new Laptop("Ноутбук", "2,2", 15000, 3);
        products[1] = new TV("Телевизор", "Черный", 20000, 5);
        Check check = new Check(products);
        System.out.println(check.getDate());
        for (Product pr: check.products){
            System.out.print(pr.getTitle() + ", ");
            System.out.print(pr.getPrice() + ", ");
            System.out.print(pr.getQuantity() + ", ");
            System.out.println(pr.getCost());
        }
    }
}
