package ru.perepelitsina.part1.lesson29;

public class Person {
    private int age;
    private String lastName;
    private String sex;

    public Person(int age, String lastName, String sex) {
        this.age = age;
        this.lastName = lastName;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return person.hashCode() == this.hashCode();
    }
    @Override
    public int hashCode() {
        return (age*31 + lastName.hashCode()*31 + sex.hashCode()*31);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
