package ru.perepelitsina.part1.lesson03;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        float sec = in.nextFloat();
        System.out.println(sec/60/60 + " час");
    }
}
