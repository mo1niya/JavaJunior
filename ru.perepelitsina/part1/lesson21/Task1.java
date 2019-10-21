package ru.perepelitsina.part1.lesson21;

//Дан двумерный массив. Задача – написать метод
//public void toLeft() {}
//1.Пройти с 1-ой до последней строки
//2.Пройти с 1-го до предпоследнего элемента
//3.В текущую ячейку поместить значение следующей
//4.Последнему элементу присвоить 0
//Так выглядит любая строка после преобразования данным методом
public class Task1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6,7,8,9},
                        {2,3,4,5,6,7,8,9,1},
                        {3,4,5,6,7,8,9,1,2}};
        Task1 task1 = new Task1();
        task1.toLeft(arr);
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length-1; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(arr[i][arr[i].length-1]);
        }
    }
    public void toLeft(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length-1; j++){
                arr[i][j] = arr[i][j+1];
            }
            arr[i][arr[i].length-1] = 0;
        }
    }
}
