package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int size = left.length() > right.length() ? right.length() : left.length();
        int rsl = 0;
        char[] leftArray = left.toCharArray();
        char[] rightArray = right.toCharArray();

        for (int i = 0; i < size; i++) {
            if (left.length() == right.length()) {
                rsl = Character.compare(leftArray[i], rightArray[i]);
            } else {
                rsl = Integer.compare(leftArray[i], rightArray[i]);
                break;
            }
        }
        return rsl;
    }
}