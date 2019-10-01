package ru.perepelitsina.part1.lesson13;

import java.util.InputMismatchException;
import java.util.Scanner;

//Написать программу "воспитанный ребенок".
//Программа должна имитировать поведение воспитанного ребенка,
// которого мама кормит вкусной или невкусной едой.
// Если еда не нравится, ребенок ее не ест: выбрасывается
// исключительная ситуация, которая обрабатывается «мамой».
// Воспитанный ребенок, даже если еда не естся, в любом случае скажет «спасибо» и поцелует маму.
//Создать перечисление «Еда» с несколькими вариантами еды: морковь, яблоко, каша и т.д.
//Создать класс «ребенок» с методом «кушать», принимающий на вход некоторую еду.
// В методе происходит сравнение поступившей еды с вкусовыми предпочтениями и
//в случае если они не совпадают, выбрасывается исключение. «Одобренная» ребенком еда съедается:
// возвращается сообщение «съел … за обе щеки».
//Вне зависимости съел ребенок еду или выплюнул, ребенок благодарит маму, печатая в консоль «спасибо, мама».
//Создать главный класс и метод main - это будет «Мама». «Мама» дает ребенку «еду» и обрабатывает исключения ребенка.
public class Mother {
    private static Food[] foods = Food.values();
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Выберите, чем накормить ребенка: ");
        int i = 1;
        for (Food f: foods){
            System.out.println(i + " " + f);
            i++;
        }
        Food f1 = getFood();
        try {
            child.eat(f1);
        } catch (MyException ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Спасибо, мама!");
        }
    }

    private static Food getFood(){
        Scanner in = new Scanner(System.in);
        Food food;
        try {
            int foodNum = in.nextInt();
            food = foods[foodNum-1];
        } catch (InputMismatchException ex){
            System.out.println("Нужно ввести число!");
            food = getFood();
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Нет такого номера");
            food =getFood();
        } finally {
            in.close();
        }
        return food;
    }
}
