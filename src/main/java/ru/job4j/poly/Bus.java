package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public String drive() {
        return null;
    }

    @Override
    public int passengers(int members) {
        return 0;
    }

    @Override
    public int fill(int fuel) {
        return fuel * 40;
    }
}
