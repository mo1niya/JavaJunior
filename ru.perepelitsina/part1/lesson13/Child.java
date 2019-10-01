package ru.perepelitsina.part1.lesson13;

public class Child {
    void eat(Food food) throws MyException {
        if (food.ordinal() % 2 > 0) {
            System.out.println("Съел " + food + " за обе щеки");
        } else {
            throw new MyException("Не буду!");
        }
    }
}
