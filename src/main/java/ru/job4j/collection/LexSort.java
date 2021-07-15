package ru.job4j.collection;

import java.util.*;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftStr = left.split("\\. ");
        String[] rightStr = right.split("\\. ");
        int num = Integer.parseInt(leftStr[0]);
        int num2 = Integer.parseInt(rightStr[0]);
        return Integer.compare(num, num2);
    }

}


