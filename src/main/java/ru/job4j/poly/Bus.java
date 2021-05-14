package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

    @Override
    public void passengers(int members) {
        if (members < 100) {
            System.out.println("Bus is driving");
        } else {
            System.out.println("Bus is not driving");
        }

    }

    @Override
    public int fill(int fuel) {
        return fuel * 40;
    }

}
