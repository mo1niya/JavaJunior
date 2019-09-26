package ru.perepelitsina.part1.lesson10;

import java.util.Scanner;

//Напишите программу которая получает на вход некую строку ,
// после она вызывает метод, заменяющий в строке все вхождения
// слова «бяка» на «вырезано цензурой» и выводит результат в консоль!
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            String str = in.nextLine();
            String newStr = str.replaceAll("\\b(?iu)(бяка)\\b", "вырезано цензурой");
            System.out.println(newStr);
        } catch (Exception e){
            System.out.println("Введите строку");
        }
    }
}
