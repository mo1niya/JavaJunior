package ru.perepelitsina.part1.lesson09.task1;

import ru.perepelitsina.part1.lesson09.task2.Fly;
import ru.perepelitsina.part1.lesson09.task2.Run;
import ru.perepelitsina.part1.lesson09.task2.Swim;

public class Duck extends Animal implements Run, Fly, Swim {
    {this.name = "Duck";}
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String Fly() {
        return "I'm fly";
    }

    @Override
    public String Run() {
        return "I'm run";
    }

    @Override
    public String Swim() {
        return "I'm swim";
    }
}
