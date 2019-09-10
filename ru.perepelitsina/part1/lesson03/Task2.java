package ru.perepelitsina.part1.lesson03;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму: ");
        float sum = in.nextFloat();
        float itog = sum/100*13;
        System.out.println(sum-itog + " рубрей");
    }
}
