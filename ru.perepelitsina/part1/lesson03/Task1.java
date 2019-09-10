package ru.perepelitsina.part1.lesson03;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество литров: ");
        float liters = in.nextFloat();
        System.out.println(liters*43 + " рубрей");
        in.close();
    }
}
