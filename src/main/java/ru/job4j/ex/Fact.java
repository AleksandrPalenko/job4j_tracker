package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {

    }

    public int calc(int n) {
        int rsl = -1;
        for (int i = 1; i <= n; i++) {
            if (n < 0) {
                throw new IllegalArgumentException("the input element must be greater than zero");
            }
            rsl = i * i;
        }
        return rsl;
    }
}
