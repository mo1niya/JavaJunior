package ru.perepelitsina.part1.lesson08;

//Реализовать класс Calculator, который будет содержать статические
// методы для операций вычитания, сложения, умножения, деления и взятия
// процента от числа. Класс должен работать как с целыми числами, так и с дробями.
public class Task2 {
    public static float addition(float a1, float a2){
        float add = a1 + a2;
        return add;
    }
    public static float subtraction(float b1, float b2){
        float sub = b1 - b2;
        return sub;
    }
    public static float multiplication(float c1, float c2){
        float mul = c1*c2;
        return mul;
    }
    public static float division(float d1, float d2){
        float div = d1 / d2;
        return div;
    }
    public static float percent(float f1, float f2){
        float per = f1/100*f2;
        return per;
    }
}
