package ru.perepelitsina.part1.lesson08;

//Реализовать класс в конструкторе которого будет счетчик
// количества создаваемых объектов. Написать метод для получения информации о количестве.
public class Task3 {
    static int count;
    Task3(){
        count++;
    }
}
