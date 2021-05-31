package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>(100);
    //private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.set(size++, item);
        //items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items.get(index);
            //Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public List<Item> findByName(String key) {
        List<Item> otherName = new ArrayList<>();
        for (int i = 0; i < this.size; i++) {
            Item item = items.get(i);
            if (key.equals(item.getName())) {
                otherName.add(item);
            }
        }
        return List.copyOf(otherName);
        //return Arrays.copyOf(otherName, sizeName);
    }

    public List<Item> findAll() {
        for (Item value : items) {
            if (value != null) {
                items.add(value);
            }
        }
        return List.copyOf(items);
        // return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                //if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.set(index, item);
            // items[index] = item;
        }
        return true;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        if (index != -1) {
            System.arraycopy(items, index + 1, items, index, this.size - index - 1);
            items.set(size - 1, null);
            //  items[size - 1] = null;
            size--;
            return true;
        }
        return false;
    }
}