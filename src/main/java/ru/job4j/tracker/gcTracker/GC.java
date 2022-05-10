package ru.job4j.tracker.gcTracker;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.store.MemTracker;

public class GC {
    public static void main(String[] args) {
        MemTracker mem = new MemTracker();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            mem.add(new Item("item" + i)
            );
        }
        long finishTime = System.currentTimeMillis();
        System.out.printf("%nApp running time: %d%n", finishTime - startTime);
    }
}

