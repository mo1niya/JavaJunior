package ru.perepelitsina.part1.lesson27;

import java.util.Scanner;

//Ряд Фибоначчи - это числовой ряд, в котором следующее число является суммой двух предыдущих чисел.
//Например :
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 и т. д.
//Есть два способа напечатать серии Фибоначчи.
//Используя итерацию
//Использование рекурсии
//Ваша задача реализовать оба способа.
public class Task2 {
    private static int sum = 0;
    private static int first = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количества элементов");
        try {
            int n = in.nextInt();
            recursionF(n, 1);
        } catch (Exception e){
            System.out.println("Это не число");
        } finally {
            in.close();
        }
    }
    private static void recursionF(int i, int second){
        if (i > 0){
            System.out.print(sum + " ");
            first = second;
            second = sum;
            sum = first + second;
            i--;
            recursionF(i, second);
        }
    }
}
