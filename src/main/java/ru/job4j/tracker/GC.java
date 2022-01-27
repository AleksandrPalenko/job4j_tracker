package ru.job4j.tracker;

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

