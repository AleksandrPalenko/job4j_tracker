package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        items.add(item);
        return item;
    }

    public Item findById(List<Integer> id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findByName(List<String> key) {
        List<Item> otherName = new ArrayList<>();
        for (Item item : items) {
            if (key.equals(item.getName())) {
                otherName.add(item);
            }
        }
        return List.copyOf(otherName);
    }

    public List<Item> findAll() {
        for (Item value : items) {
            if (value != null) {
                items.add(value);
            }
        }
        return List.copyOf(items);
    }

    private int indexOf(List<Integer> id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(List<Integer> id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.set(index, item);
            // items[index] = item;
        }
        return true;
    }

    public boolean delete(List<Integer> id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }
}