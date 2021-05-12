package ru.job4j.poly;

public class Bus implements Transport {

    private int price;
    private int massive[] = new int[50];

    @Override
    public String drive() {
        return null;
    }

    @Override
    public int passengers(int members) {
        return massive[members];
    }


    @Override
    public int fill(int fuel) {
        if (fuel < 0) {
            return 0;
        } else {
            return this.price;
        }

    }

}
