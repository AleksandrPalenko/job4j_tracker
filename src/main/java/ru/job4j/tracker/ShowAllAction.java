package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ====");
        List<List<Item>> items = Arrays.asList(tracker.findAll());
        //Item[] items = tracker.findAll();
        int size = items.size(); //добавили размер листа
        if (size > 0) {
            for (List<Item> item : items) {
                out.println(item);
            }
        } else {
            out.println("Хранилище еще не содержит заявок.");
        }
        return true;
    }
}
