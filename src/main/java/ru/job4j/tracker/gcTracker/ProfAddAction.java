package ru.job4j.tracker.gcTracker;

import ru.job4j.tracker.*;

public class ProfAddAction implements UserAction {

    @Override
    public String name() {
        return "Add items";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        for (int i = 0; i < 1000000; i++) {
            tracker.add(new Item("Many Items " + i));
            System.out.printf("%nAdd item: %d%n " + i);
        }
        return true;
    }
}
