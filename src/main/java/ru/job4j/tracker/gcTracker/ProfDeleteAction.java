package ru.job4j.tracker.gcTracker;

import ru.job4j.tracker.*;

import java.util.List;

public class ProfDeleteAction implements UserAction {
    private final Output out;

    public ProfDeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        List<Item> list = tracker.findAll();
        if (list.size() != 0) {
            for (Item item : list) {
                tracker.delete(item.getId());
                out.println("%nDelete item: %d%n " + item);
            }
        } else {
            out.println("%nDelete item is not possible: %d%n ");
        }
        return true;
    }
}
