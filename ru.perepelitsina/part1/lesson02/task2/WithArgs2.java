package ru.perepelitsina.part1.lesson02.task2;

public class WithArgs2 {
    public static void main(String[] args) {
        int itog = Integer.parseInt(args[0])/100*13;
        System.out.println(Integer.parseInt(args[0])-itog + " рубрей");
    }
}
