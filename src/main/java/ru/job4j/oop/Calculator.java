package ru.job4j.oop;

public class Calculator {

    public static int max(int first, int second) {
        return first > second ? first : second;

    }

    public static int max(int first, int second, int third) {
        int tmp = max(first, second);
        return max(tmp, third);

    }

    public static int max(int first, int second, int third, int four) {
        return max(max(first, second, third), four);
    }
}
