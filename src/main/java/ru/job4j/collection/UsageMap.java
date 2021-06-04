package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("palenko.as@mail.ru", "Palenko Aleksandr");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String box = entry.getKey();
            String value = entry.getValue();
            System.out.println("Почта аккаунта: " + box + " ; " + " ФИО: " + value);
        }

    }
}
