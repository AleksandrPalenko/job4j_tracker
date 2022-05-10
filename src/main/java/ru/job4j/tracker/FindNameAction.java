package ru.job4j.tracker;

import ru.job4j.tracker.store.Store;

import java.util.List;

public class FindNameAction implements UserAction {
    private final Output out;

    public FindNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by Name";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Find item by Name ===");
        String name = input.askStr("Enter name: ");
        List<Item> items = tracker.findByName(name);
        int size = items.size();
        if (size > 0) {
            for (Item item : items) {
                if (item != null) {
                    out.println(" item ");
                }
            }
        } else {
            out.println("Заявки с именем: " + name + " не найдены.");
        }
        return true;
    }
}
