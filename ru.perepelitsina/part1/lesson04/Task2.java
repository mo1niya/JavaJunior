package ru.perepelitsina.part1.lesson04;

import java.util.Scanner;

//Написать программу, которая описывает введенное число.
// Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner in = new Scanner(System.in);
        try {
            float num = in.nextFloat();
            if (num>0){
                System.out.println("Положительное число");
            } else if (num<0){
                System.out.println("Отрицательное число");
            } else {
                System.out.println("Это 0");
            }

            if (num%2 == 0){
                System.out.println("Чётное число");
            } else {
                System.out.println("Нечётное число");
            }
        } catch (Exception e){
            System.out.println("Это не число");
        }
        in.close();
    }
}
