package ru.perepelitsina.part1.lesson25;

import java.util.*;

//public boolean isUnique(Map<String, String> map);
//Написать метод, который возвращает true, если в мапе нет двух и более одинаковых value, и false в противном случае.
//Для пустой мапы метод возвращает true.
//Например, для метода {Вася=Иванов, Петр=Петров, Виктор=Сидоров, Сергей=Савельев, Вадим=Викторов} метод вернет true,
//а для {Вася=Иванов, Петр=Петров, Виктор=Иванов, Сергей=Савельев, Вадим=Петров} метод вернет false.
public class Task1 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("Вася", "Иванов");
        map1.put("Петр", "Петров");
        map1.put("Виктор", "Сидоров");
        map1.put("Сергей", "Савельев");
        map1.put("Вадим", "Викторов");
        System.out.println(isUnique(map1));
        Map<String, String> map2 = new HashMap<>();
        map2.put("Вася", "Иванов");
        map2.put("Петр", "Петров");
        map2.put("Виктор", "Иванов");
        map2.put("Сергей", "Савельев");
        map2.put("Вадим", "Петров");
        System.out.println(isUnique(map2));
        Map<String, String> map3 = new HashMap<>();
        System.out.println(isUnique(map3));
    }
    private static boolean isUnique(Map<String, String> map){
        TreeSet<String> set = new TreeSet<>(map.values());
        if (set.size() == map.size() || map.size() == 0){
            return true;
        } else {
            return false;
        }
    }
}
