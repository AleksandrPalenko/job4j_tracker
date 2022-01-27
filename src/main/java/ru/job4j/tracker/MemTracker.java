package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MemTracker implements Store {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findByName(String key) {
        List<Item> otherName = new ArrayList<>();
        for (Item item : items) {
            if (key.equals(item.getName())) {
                otherName.add(item);
            }
        }
        return List.copyOf(otherName);
    }

    public List<Item> findAll() {
        return new ArrayList<Item>(items);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.set(index, item);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }

    public static void main(String[] args) {
        MemTracker mem = new MemTracker();
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            mem.add(new Item("item" + i)
            );
            System.out.println("item " + i);
        }
        long finishTime = System.currentTimeMillis();
        System.out.printf("%nApp running time: %d%n", finishTime - startTime);
    }
}

