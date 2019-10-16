package ru.perepelitsina.part1.lesson18;

import java.io.*;

//Написать программу, которая копирует файл с одной кодировкой в файл с другой.
public class task1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader (new FileInputStream("UTF8.txt"), "UTF8"));
        OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("windows-1251.txt"), "koi8")){
            String ln;
            while ((ln = br.readLine()) != null){
                ow.write(ln + "\n");
            }
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден!");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
