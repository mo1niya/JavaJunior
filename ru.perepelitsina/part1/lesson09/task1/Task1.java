package ru.perepelitsina.part1.lesson09.task1;

//Написать абстрактный класс Animal с абстрактным методом getName.
// Сделать несколько классов животных, наследников Animal.
// Метод getName должен выводит название каждого животного.
public class Task1 {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();
        Duck duck = new Duck();
        System.out.println(fish.getName() + ": " + fish.Swim());
        System.out.println(rabbit.getName() + ": " + rabbit.Run());
        System.out.println(duck.getName() + ": " + duck.Fly() + " " + duck.Run()+ " " + duck.Swim());
    }
}
