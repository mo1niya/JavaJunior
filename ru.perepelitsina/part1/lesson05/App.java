package ru.perepelitsina.part1.lesson05;

public class App {
    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new Laptop("Ноутбук", "2,2ГГц", 15000, 3);
        products[1] = new TV("Телевизор", "Черный", 20000, 5);
        Check check = new Check(products);
        System.out.println(check.getDate());
        for (Product pr: check.products){
            System.out.print(pr.getTitle() + ", ");
            try {
                Laptop laptop = (Laptop) pr;
                System.out.print(laptop.getCpu() + " ");
            } catch (ClassCastException e){

            }
            try {
                TV tv = (TV) pr;
                System.out.print(tv.getColor() + " ");
            }catch (ClassCastException e){

            }
            System.out.print(pr.getPrice() + ", ");
            System.out.print(pr.getQuantity() + ", ");
            System.out.println(pr.getCost());
        }
    }
}
