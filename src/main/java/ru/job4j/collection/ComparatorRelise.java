package ru.job4j.collection;

import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorRelise {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(4, "Fix bugs"),
                new Item(2, "Impl task"),
                new Item(1, "Reboot server")
        );
        System.out.println(items);
        Collections.sort(items, new SortByItemIncrease());
        //Collections.reverse(items);
        System.out.println(items);

    }

}
