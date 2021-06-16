package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String wordsLeft = String.valueOf(left.split(" . "));
        String wordsRight = String.valueOf(right.split(" . "));
        int words = Integer.parseInt(wordsLeft);
        int words2 = Integer.parseInt(wordsRight);
        if (wordsLeft.compareTo(wordsRight) == 0) {
           return Integer.compare(words, words2);
        }
        return left.compareTo(right);
    }
}
