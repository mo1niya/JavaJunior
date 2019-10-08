package lesson14;

public enum Drinks {
    BLACKTEA(50),
    CAPPUCCINO(60),
    ESPRESSO(70),
    GREENTEA(80),
    WATER(90);

    private int price;

    Drinks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
