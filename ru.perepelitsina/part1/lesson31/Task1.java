package ru.perepelitsina.part1.lesson31;

//Палиндром - это слово, фраза, число или другая последовательность символов или элементов,
// которая читает то же самое вперед или назад.
//Например: 12121 - палиндром, так как он читает то же самое вперед или назад. мадам тоже палиндром.
//Требуется написать 2 реализации
//Перемещение с обоих концов строки одновременно
//Используя стандартные функции строки
public class Task1 {
    public static void main(String[] args) {
        String p = "12121";
        movement(p);
        revers(p);
    }
    private static void movement(String str){
        System.out.print("Перемещение с обоих концов строки одновременно ");
        char[] chars = str.toCharArray();
        char temp;
        int x = chars.length-1;
        for (int i = 0; i <= x/2; i++){
            temp = chars[i];
            chars[i] = chars[x-i];
            chars[x-i] = temp;
        }
        for (char c: chars){
            System.out.print(c);
        }
        System.out.println();
    }
    private static void revers(String str){
        System.out.print("Используя стандартные функции строки ");
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        System.out.println(buffer);
    }
}
