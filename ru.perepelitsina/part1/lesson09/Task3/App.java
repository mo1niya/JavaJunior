package ru.perepelitsina.part1.lesson09.Task3;

public class App {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        System.out.println("I'm traveler. " + traveler.InBoat()+ " " + traveler.InShip());
        Runner runner = new Runner();
        System.out.println("I'm runner. " + runner.RunCrosstab() + " " + runner.RunMarathon());
        Student student = new Student();
        System.out.println("I'm student. " + student.InBoat() + " " + student.InShip() + " " + student.RunCrosstab() + " " + student.RunMarathon());
    }
}
