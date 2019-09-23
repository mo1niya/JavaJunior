package ru.perepelitsina.part1.lesson09.task1;

import ru.perepelitsina.part1.lesson09.task2.Run;

public class Rabbit extends Animal implements Run {
    String name = "Rabbit";
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String Run() {
        return "I'm run";
    }
}
