package ru.perepelitsina.part1.lesson30;

import java.util.HashMap;
import java.util.Map;

//Напишите программу для поиска первого неповторяющегося символа в строке.
// Например, первый неповторяющийся символ в «total» равен «o», а первый неповторяющийся символ в «teter» равен «r».
public class Task1 {
    public static void main(String[] args) {
        String total = "total";
        String teter = "teter";
        System.out.println("Первый неповторяющийся символ в «total» равен " + firstChar(total));
        System.out.println("Первый неповторяющийся символ в «teter» равен " + firstChar(teter));
    }
    public static char firstChar(String str){
        char ch = '-';
        Map<Character, Integer> characterMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (characterMap.containsKey(c)){
                int j = characterMap.get(c);
                j++;
                characterMap.put(c, j);
            } else {
                characterMap.put(c, 1);
            }
        }
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (characterMap.get(c) == 1){
                ch = c;
                break;
            }
        }
        return ch;
    }
}
