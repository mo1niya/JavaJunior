package ru.perepelitsina.part1.lesson16;

import java.io.*;
import java.util.Scanner;

//Домашняя библиотека
//Есть набор объектов типа "Книга". Каждая книга имеет название, автора, год издания. Можно больше, по желанию.
//Программа должна уметь:
//добавлять книгу в библиотеку.
//показывать список книг в библиотеке.
//восстанавливать содержимое библиотеки после перезапуска.
//показывать соответствующее сообщение в случае ошибок.
//Важно!
//потоки обязательно должны закрываться
//отсутствие файла на диске - не ошибка, а частный случай пустой библиотеки
public class Library {
    private static String fileName = "data.bin";
    public static void main(String[] args) {
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("1 Добавить книгу в библиотеку");
            System.out.println("2 Посмотреть список книг");
            int a;
            try{
                 a = in.nextInt();
            }catch (Exception e){
                System.out.println("Некорректное значение");
                continue;
            }
            switch (a){
                case 1:
                    try{
                        newBook();
                    } catch (Exception e){
                        System.out.println("Некорректное значение");
                        continue;
                    }
                    break;
                case 2:
                    if (new File(fileName).exists()) {
                        readBook();
                    } else {
                        System.out.println("Библиотека пуста");
                    }
                    break;
            }
        }
    }
    private static void newBook(){
        Scanner in = new Scanner(System.in);
        System.out.println("Название: ");
        String name = in.nextLine();
        System.out.println("Автор: ");
        String author = in.nextLine();
        System.out.println("Жанр: ");
        String genre = in.nextLine();
        System.out.println("Год издания: ");
        int date = in.nextInt();
        Book book = new Book(name, author, date, genre);
        try (ObjectOutputStream oos = createStream(new File(fileName))) {
            oos.writeObject(book);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void readBook(){
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)){
            try {
                while (true){
                    System.out.println(ois.readObject());
                }
            } catch (EOFException e){
            }
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    /**
     * Вспомогательный метод для создания потока
     */
    private static ObjectOutputStream createStream(File fileName) throws IOException {
        return fileName.exists()
                ? new AppendingObjectOutputStream(new FileOutputStream(fileName, true))
                : new ObjectOutputStream(new FileOutputStream(fileName, true));
    }
}
