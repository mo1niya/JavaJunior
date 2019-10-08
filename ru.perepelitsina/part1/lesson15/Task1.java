package ru.perepelitsina.part1.lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

//Написать программу, которая будет создавать, переименовывать, копировать и удалять файл.
public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/file.txt");
        File newFile = new File("src/new_file.txt");
        File newPath = new File("src/ru/perepelitsina/part1/lesson15/new_file.txt");
        try {
            file.createNewFile();
            file.renameTo(newFile);
            Files.copy(newFile.toPath(), newPath.toPath());
            newFile.delete();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
