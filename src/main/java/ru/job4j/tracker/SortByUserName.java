package ru.job4j.tracker;

import ru.job4j.collection.User;

public class SortByUserName implements Comparable<User> {
    @Override
    public int compareTo(User o) {
        return o.compareTo(o);
    }
}