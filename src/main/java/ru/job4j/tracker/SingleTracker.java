package ru.job4j.tracker;

import java.util.List;

public class SingleTracker {
    private MemTracker memTracker = new MemTracker();

    private SingleTracker instance = null;

    private SingleTracker() {
    }

    public Item add(Item item) {
        return memTracker.add(item);
    }

    public Item findById(int id) {
        return memTracker.findById(id);
    }

    public List<Item> findAll() {
        return memTracker.findAll();
    }

    public boolean replace(int id, Item item) {
        return memTracker.replace(id, item);
    }

    public boolean delete(int id) {
        return memTracker.delete(id);
    }

    public SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

}
