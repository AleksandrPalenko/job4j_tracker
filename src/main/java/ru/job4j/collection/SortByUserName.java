package ru.job4j.collection;

public class SortByUserName implements Comparable<User> {
    @Override
    public int compareTo(User o) {
        return o.compareTo(o);
    }
}
