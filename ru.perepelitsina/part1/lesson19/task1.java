package ru.perepelitsina.part1.lesson19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

//Дан текстовый файл определенной структуры, в котором содержится информация о покупках.
//Формат файла:
//Название товара
//количество
//цена
//Необходимо написать программу, которая выведет на экран чек, сформированный из этого файла. В чеке должна быть информация:
//название товара:  цена Х кол-во = стоимость
//В конце отчета вывести итоговую стоимость.
public class task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("products.txt"))){
            scanner.useLocale(Locale.US);
            if (scanner.hasNext()){
                String h1 = "Наименование";
                String h2 = "Цена";
                String h3 = "Кол-во";
                String h4 = "Стоимость";
                System.out.printf("%-20s %-10s %-10s %-10s\n", h1, h2, h3, h4);
                System.out.println("====================================================");
            }
            int count = 0;
            float price = 0;
            float quantity;
            float sum = 0;
            float cost;
            while (scanner.hasNext()) {
                switch (count){
                    case 0: String str = scanner.nextLine();
                        if (str.length() == 0) {
                            str = scanner.nextLine();
                        }
                        System.out.printf("%-20s", str);
                        count++;
                        break;
                    case 1:
                        price = scanner.nextFloat();
                        System.out.printf("%-10.3f", price);
                        count++;
                        break;
                    case 2:
                        quantity = scanner.nextFloat();
                        System.out.printf("x %-10.3f =", quantity);
                        cost = price * quantity;
                        sum += cost;
                        price = 0;
                        System.out.printf("%10.3f\n", cost);
                        count = 0;
                        break;
                }
            }
            System.out.println("====================================================");
            System.out.printf("%50.3f\n", sum);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
