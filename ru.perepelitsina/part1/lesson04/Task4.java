package ru.perepelitsina.part1.lesson04;

import java.util.Scanner;

//Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            System.out.println("Арифметическая прогрессия:");
            int a = 1;
            for (int i = 1; i<=n; i++){
                System.out.println("a" + i + " = " + a + " + " + 2 + " = " + (a+2));
                a = a+2;
            }
            System.out.println("Геометрическая прогрессия:");
            int b = 1;
            for (int i = 1; i<=n; i++){
                System.out.println("b" + i + " = " + b + " * " + 2 + " = " + (b*2));
                b = b*2;
            }
        } catch (Exception e){
            System.out.println("Это не число");
            System.exit(0);
        }
        in.close();
    }
}
