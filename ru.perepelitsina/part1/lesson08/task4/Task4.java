package ru.perepelitsina.part1.lesson08.task4;

//Реализовать два класса: договор и акт.
// В каждом сделать поля: номер, дата, список товаров (массив строк).
// Написать класс со статическим методом конвертации договора в
// акт (на вход передавать договор, на выходе получаем акт).
public class Task4 {
    static Act conversion(Contract contract){
        Act act = new Act();
        act.setNumber(contract.getNumber());
        act.setData(contract.getData());
        act.setProducts(contract.getProducts());
        return act;
    }
}
