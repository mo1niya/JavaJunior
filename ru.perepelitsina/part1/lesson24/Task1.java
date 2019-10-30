package ru.perepelitsina.part1.lesson24;

import java.util.HashSet;
import java.util.Set;

//Написать метод, который возвращает множество, в котором удалены все элементы четной длины из исходного множества.
//public Set<String> removeEvenLength(Set<String> set);
//Например, для множества ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"] метод вернет ["foo", "bar", "spoon", "!"]
public class Task1 {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("foo");
        strings.add("buzz");
        strings.add("bar");
        strings.add("fork");
        strings.add("bort");
        strings.add("spoon");
        strings.add("!");
        strings.add("dude");
        for (String s: removeEvenLength(strings)){
            System.out.println(s);
        }
    }
    private static Set<String> removeEvenLength(Set<String> set){
        Set<String> tmp = new HashSet<>();
        for (String str: set){
            if (str.length()%2 == 0){
                tmp.add(str);
            }
        }
        set.removeAll(tmp);
        return set;
    }
}
