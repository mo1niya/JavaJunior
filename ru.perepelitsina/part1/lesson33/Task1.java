package ru.perepelitsina.part1.lesson33;

import java.util.*;

//Вывести максимально встречающийся символ в строке.
//Пример:
//This is test messageThis is test message
//Character: s has occurred maximum times in String: 5
public class Task1 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap();
        String str = "This is test message";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (map.containsKey(c)){
                int j = map.get(c);
                j++;
                map.put(c, j);
            } else {
                map.put(c, 1);
            }
        }
        int x = 0;
        char c = '-';
        for (Map.Entry<Character, Integer> entry: map.entrySet()){
            int val = entry.getValue();
            if (val > x){
                x = val;
                c = entry.getKey();
            }
        }
        System.out.println("Mаксимально встречающийся символ - " + c + " - " + x + " раз.");
    }
}
