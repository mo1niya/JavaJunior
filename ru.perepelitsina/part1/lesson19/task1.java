package ru.perepelitsina.part1.lesson19;

import java.io.File;
import java.io.FileNotFoundException;
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
            scanner.useDelimiter("\t|\r\n|\n");
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
            float quantity = 0;
            float sum = 0;
            float cost = 0;
            while (scanner.hasNext()) {
                switch (count){
                    case 0: System.out.printf("{%-20s}", scanner.nextLine());
                        count++;
                        continue;
                    case 1:
                        if (scanner.hasNextFloat()){
                            price = scanner.nextFloat();
                        } else {
                            price = Float.parseFloat(scanner.nextLine());
                        }
                        System.out.printf("%-10.3f", price);
                        count++;
                        continue;
                    case 2:
                        if (scanner.hasNextFloat()){
                            quantity = scanner.nextFloat();
                        } else {
                            quantity = Float.parseFloat(scanner.nextLine());
                        }
                        System.out.printf("%-10.3f", quantity);
                        cost = price * quantity;
                        sum += cost;
                        price = 0;
                        quantity = 0;
                        System.out.printf("%10.3f\n", cost);
                        count = 0;
                        continue;
                }
            }
            System.out.println("====================================================");
            System.out.printf("%40.3f\n", cost);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
