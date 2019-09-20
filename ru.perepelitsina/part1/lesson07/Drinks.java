package ru.perepelitsina.part1.lesson07;

public enum Drinks {
    BLACKTEA,
    GREENTEA,
    ESPRESSO,
    CAPPUCCINO,
    WATER;

    public static float getPrice(int drink){
        float price;
        switch (drink){
            case 1: price = 50;
                break;
            case 2: price = 60;
                break;
            case 3: price = 70;
                break;
            case 4: price = 80;
                break;
            case 5: price = 90;
                break;
            default: price = 0;
                break;
        }
        return price;
    }
}
