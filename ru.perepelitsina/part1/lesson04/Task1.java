package ru.perepelitsina.part1.lesson04;

import java.util.Scanner;

//Написать программу для поиска минимального из двух чисел.
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int f = in.nextInt();
        System.out.println("Введите второе+ число");
        int s = in.nextInt();
        if (f>s){
            System.out.println("Меньшее число - " + s);
        } else if (s>f){
            System.out.println("Меньшее число - " + f);
        } else {
            System.out.println("Числа равны");
        }
        in.close();
    }
}