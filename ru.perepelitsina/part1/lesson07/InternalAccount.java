package ru.perepelitsina.part1.lesson07;

public class InternalAccount {
    public float getSum() {
        return sum;
    }
    public void setSum(float sum) {
        this.sum = this.sum + sum;
    }
    private float sum;

}
