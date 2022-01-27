package ru.job4j.tracker.gcTracker;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Store;
import ru.job4j.tracker.UserAction;

public class ProfDeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        for (int i = 0; i < 100000; i++) {
            tracker.delete(i);
            System.out.printf("%nDelete item: %d%n " + i);
        }
        return true;
    }
}
