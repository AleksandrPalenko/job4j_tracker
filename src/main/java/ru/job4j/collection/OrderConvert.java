package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        // for orders
        for (Order entry : orders) {
            map.put(entry.getNumber(), entry);
        }
        return map;
    }

}
