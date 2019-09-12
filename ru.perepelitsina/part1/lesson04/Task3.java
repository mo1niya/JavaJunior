package ru.perepelitsina.part1.lesson04;

//Написать программу для вывода на экран таблицы умножения.
public class Task3 {
    public static void main(String[] args) {
        for (int i = 1; i<10; i++){
            for (int j = 0; j<=10; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
