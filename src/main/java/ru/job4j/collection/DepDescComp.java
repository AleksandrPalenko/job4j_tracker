package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String dep1, String dep2) {
        String[] depStr1 = dep1.split("/");
        String[] depStr2 = dep2.split("/");
        int sim1 = Integer.parseInt(depStr1[0]);
        int sim2 = Integer.parseInt(depStr2[0]);
        int rsl = dep1.compareTo(dep2);
        if (sim1 != sim2) {
            Integer.compare(sim1, sim2);
        } else {
            return rsl;
        }
        return Integer.compare(sim2, sim1);
    }
}
