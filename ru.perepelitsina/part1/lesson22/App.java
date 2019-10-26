package ru.perepelitsina.part1.lesson22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Написать класс PersonSuperComparator,
//который имплементит Comparator, но умеет сравнивать по двум параметрам , возраст и имя.
//Класс Person теперь содержит два поля int age и String name
public class App {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Nick", 30));
        people.add(new Person("Alice", 10));
        people.add(new Person("Nick", 20));
        Collections.sort(people, new PersonSuperComparator());
        for (Person p: people){
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
