package ru.perepelitsina.part1.lesson21;

//Задача: Имеется массив, нужно переставить элементы массива в обратном порядке.
//Задачу не зачитывать если использованы утильные методы класса Arrays.
// Решением также не являются манупуляции с выводом массива. Необходимо действительно перемещать элементы.
//Вывести массив в консоль до и после вызова метода по реверсу массива
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
        int temp;
        for (int j = 0; j < arr.length/2; j++){
            temp = arr[j];
            arr[j] = arr[arr.length-j-1];
            arr[arr.length-j-1] = temp;
        }
        for (int k: arr){
            System.out.print(k + " ");
        }
    }
}
