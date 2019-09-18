package ru.perepelitsina.part1.lesson04;

import java.util.Scanner;

//Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый член прогрессии");
        System.out.println("Введите шаг прогрессии");
        System.out.println("Введите количества элементов прогрессии");
        try {
            float first = in.nextFloat();
            float d = in.nextFloat();
            int n = in.nextInt();
            System.out.println("Арифметическая прогрессия:");
            float a = first;
            for (int i = 1; i<=n; i++){
                System.out.println("a" + (i+1) + " = " + a + " + " + d + " = " + (a+d));
                a = a+d;
            }
            System.out.println("Геометрическая прогрессия:");
            float b = first;
            for (int i = 1; i<=n; i++){
                System.out.println("b" + (i+1) + " = " + b+ " * " + d + " = " + (b*d));
                b = b*d;
            }
        } catch (Exception e){
            System.out.println("Это не число");
        } finally {
            in.close();
        }
    }
}
