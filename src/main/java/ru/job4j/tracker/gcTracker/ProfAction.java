package ru.job4j.tracker.gcTracker;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.MemTracker;

public class ProfAction {

    public boolean executeAdd(MemTracker memTracker) {
        for (int i = 0; i < 100000; i++) {
            Item item = new Item();
            memTracker.add(item);
            System.out.printf("%nAdd item: %d%n " + i);
        }
        return true;
    }

    public boolean executeDelete(MemTracker memTracker) {
        for (int i = 0; i < 100000; i++) {
            memTracker.delete(i);
            System.out.printf("%nDelete item: %d%n " + i);
        }
        return true;
    }
}
