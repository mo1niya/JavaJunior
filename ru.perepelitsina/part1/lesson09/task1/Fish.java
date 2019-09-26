package ru.perepelitsina.part1.lesson09.task1;

import ru.perepelitsina.part1.lesson09.task2.Swim;

public class Fish extends Animal implements Swim {
    {this.name = "Fish";}
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String Swim() {
        return "I'm swim";
    }
}
