package ru.job4j.oop;

public class Calculator {

    public int max(int first, int second) {
        return first > second ? first : second;

    }

    public int max(int first, int second, int third) {
        return max(this.max(first, second), third);

    }
}
