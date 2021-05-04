package ru.job4j.encapsulation;

public class Config {
    private String name;
    private int position;
    private String properties;
    private String search;

    public Config(String name) {
        this.name = name;
    }

    void print() {
        System.out.println(position);
    }

    public String getProperties(String key) {
        return properties;
    }

    public String getSearch(String key) {
        return search;
    }
}
