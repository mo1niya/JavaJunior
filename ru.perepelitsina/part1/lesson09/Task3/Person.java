package ru.perepelitsina.part1.lesson09.Task3;

//Написать абстрактный класс Человек реализующий
// интерфейсы «бежать» и «плавать» (в каждом сделать 1-2 метода).
// Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.
public abstract class Person implements Run, Swim {
    @Override
    public String RunMarathon() {
        return "I run a marathon.";
    }

    @Override
    public String RunCrosstab() {
        return "I run cross.";
    }

    @Override
    public String InBoat() {
        return "I'm in a boat.";
    }

    @Override
    public String InShip() {
        return "I'm in a ship.";
    }
}
