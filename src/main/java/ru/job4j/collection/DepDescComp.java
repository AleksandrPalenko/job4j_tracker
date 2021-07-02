package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String dep1, String dep2) {
        String[] depStr1 = dep1.split("/");
        String[] depStr2 = dep2.split("/");
        int rsl = depStr2[0].compareTo(depStr1[0]);
        return rsl == 0 ? dep1.compareTo(dep2) : rsl;
    }
}
