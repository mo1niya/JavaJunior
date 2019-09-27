package ru.perepelitsina.part1.lesson07;

import java.util.Scanner;

//Реализовать программу «Вендинговый автомат», которая позволит:
//Посмотреть меню напитков
//Внести деньги на внутренний счет
//Выбрать номер напитка и получить его, если на счету достаточно средств.
//Программа должна обрабатывать следующие ситуации:
//Пользователь не внес деньги
//Пользователь выбрал более дорогой напиток, чем внесено денег
//Пользователь выбрал несуществующий номер напитка
//Для хранения напитков предлагается использовать массив с enum. У напитка должна быть цена и название.
public class App {
    public static void main(String[] args) {
        InternalAccount internalAccount = new InternalAccount();
        Drinks[] drinks = Drinks.values();
        while (true){
            Scanner in= new Scanner(System.in);
            System.out.println("1 - Посмотреть меню" + "\n" + "2 - Внести денги" + "\n" + "3 - Выбрать напиток");
            int x;
            try {
                x = in.nextInt();
            } catch (Exception e){
                System.out.println("Некорректное значение");
                continue;
            }
            switch (x){
                case 1: int i = 1;
                    for (Drinks dr: drinks) {
                        System.out.println(i + " " + dr + " " + drinks[i-1].getPrice() + "р.");
                        i++;
                    }
                    break;
                case 2: float sum;
                    try {
                        System.out.println("Внесите деньги");
                        sum = in.nextFloat();
                        internalAccount.setSum(sum);
                    } catch (Exception E){
                        continue;
                    }
                    break;
                case 3: int drink;
                    System.out.println("Введите номер напитка");
                    try {
                        drink = in.nextInt();
                        if (drink < 1 || drink > drinks.length){
                            System.out.println("Некорректное значение");
                            continue;
                        } else {
                            if (drinks[drink-1].getPrice() <= internalAccount.getSum()){
                                System.out.println(drinks[drink-1]);
                                internalAccount.setSum(- drinks[drink-1].getPrice());
                                System.out.println("Баланс: " + internalAccount.getSum());
                            } else {
                                System.out.println("Недостаточно средств. Пополните счёт.");
                                System.out.println("Баланс: " + internalAccount.getSum());
                                continue;
                            }
                        }

                    } catch (Exception e){
                        continue;
                    }
                    break;
            }
        }
    }
}
