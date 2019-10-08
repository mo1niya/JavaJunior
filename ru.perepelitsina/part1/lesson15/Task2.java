package ru.perepelitsina.part1.lesson15;

import java.io.File;

//Написать рекурсивный обход всех файлов и подкаталогов внутри заданного каталога.
//Дополнительное задание (необязательно): программа должна следить за глубиной рекурсии,
// сдвигая название файла/каталога на соответствующее количество пробелов.
public class Task2 {
    public static void main(String[] args) {
        createTestData();
        File file = new File("testData2");
        treeFiles(file, 0);
    }
    private static void treeFiles(File file, int depth){
        if (file.isDirectory()) {
            depth++;
            for (File f : file.listFiles()) {
                for (int i = 1; i < depth; i++){
                    System.out.print("     ");
                }
                System.out.println(f.getName());
                treeFiles(f, depth);
            }
        }
    }

    private static void createTestData() {
        try {
            new File("testData2/a/b/c/d").mkdirs();
            new File("testData2/a/c/a/a").mkdirs();
            new File("testData2/b/a/a").mkdirs();
            new File("testData2/b/c/b").mkdirs();
            new File("testData2/a/1.txt").createNewFile();
            new File("testData2/b/2.txt").createNewFile();
            new File("testData2/b/a/3.txt").createNewFile();
            new File("testData2/b/a/c/d/4.txt").createNewFile();
            new File("testData2/a/b/c/d/5.txt").createNewFile();
        } catch (Exception e) {
        }
    }
}
