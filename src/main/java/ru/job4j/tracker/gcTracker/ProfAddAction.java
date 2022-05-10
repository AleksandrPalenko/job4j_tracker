package ru.job4j.tracker.gcTracker;

import ru.job4j.tracker.*;
import ru.job4j.tracker.store.Store;

public class ProfAddAction implements UserAction {
    private final Output out;

    public ProfAddAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Add items";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Create many new Items ====");
        for (int i = 0; i < 100000; i++) {
            tracker.add(new Item("Many Items " + i));
            out.println("Add item: " + i);
        }
        return true;
    }
}
