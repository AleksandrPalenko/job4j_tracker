package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {

        Tracker track = new Tracker();
        Item item = new Item();
        Item item1 = new Item();
        Item item2 = new Item();
        item.setId(1);
        item.setName("первый");
        item1.setId(2);
        item1.setName("номер");
        item2.setId(3);
        item2.setName("Второй");
        track.add(item);
        track.add(item1);
        track.add(item2);
        System.out.println(track.findById(1));
        System.out.println(track.findById(2));
        System.out.println(track.findById(3));
    }
}


