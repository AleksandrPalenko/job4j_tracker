package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    @Override
    public String toString() {
        return "StartUI{}";
    }

    /*
          public static void main(String[] args) {
              Item date = new Item();
              LocalDateTime currentDateTime = date.getCreated();
              DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
              String currentDateTimeFormat = currentDateTime.format(formatter);
              System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);

          }

         */
    public static void main(String[] args) {
        Tracker track = new Tracker();
        Item item = new Item();
        Item item1 = new Item();
        item.setId(1);
        item.setName("Юра");
        item1.setId(2);
        item1.setName("Малая дубна");
        track.add(item);
        track.add(item1);
        System.out.println(track.findById(1));
        System.out.println(track.findById(2));
    }
}


