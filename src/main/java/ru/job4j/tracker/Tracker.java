package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] otherName = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (key.equals(item.getName())) {
                otherName[size] = item;
                size++;
            }
        }
        return Arrays.copyOf(otherName, size);
    }

    public Item[] findAll() {
        Item[] withoutNull = new Item[items.length];
        int size = 0;
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if (name != null) {
                withoutNull[size] = name;
                size++;
            }
        }

        return Arrays.copyOf(withoutNull, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}