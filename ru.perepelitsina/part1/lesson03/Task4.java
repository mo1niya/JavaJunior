package ru.perepelitsina.part1.lesson03;

import java.util.Random;
import java.util.Scanner;

//Создать консольное Java-приложение «Горячо-Холодно»
//
//Вначале программа «загадывает» случайное число от 1 до 100.
//Пользователь вводит с консоли число.
//Программа говорит пользователю «горячо», если он приблизился к «загаданному» числу и «холодно», И позволяет ввести число еще раз. если введенное число дальше от загаданного, чем предыдущее.
//Для первого ввода пользователя считаем предыдущим введенным числом 0.
//Предусмотреть возможность выхода из игры до отгадывания числа.
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Для выхода нажмите любую букву");
        int rnd = new Random().nextInt(100);
        System.out.print("Введите число до 100: ");
        int rP = rnd - 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            try {
                int num = in.nextInt();
                if (rnd == num) {
                    System.out.println("Верно!");
                    break;
                }
                int rN = Math.abs(rnd - num);
                if (rN > rP) {
                    System.out.println("Холодно!");
                    rP = rN;
                } else {
                    System.out.println("Горячо!");
                    rP = rN;
                }
            } catch (Exception e){
                System.out.println("Game over!");
                break;
            }
        }
    }
}
