package ru.perepelitsina.part1.lesson04;

import java.util.Scanner;

//Написать программу для поиска минимального из двух чисел.
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        try {
            int f = in.nextInt();
            int s = in.nextInt();
            if (f>s){
                System.out.println("Меньшее число - " + s);
            } else if (s>f){
                System.out.println("Меньшее число - " + f);
            } else {
                System.out.println("Числа равны");
            }
        } catch (Exception e){
            System.out.println("Это не число");
            System.exit(0);
        }
        in.close();
    }
}
