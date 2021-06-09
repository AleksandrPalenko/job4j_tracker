package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            char source = left.charAt(i);
            char compared = right.charAt(i);
            if (source != compared) {
               return Character.compare(source, compared);
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}