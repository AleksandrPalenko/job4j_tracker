package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> person = new ArrayList<>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person values : person) {
            if (values.getName().contains(key) || values.getPhone().contains(key)
                    || values.getAddress().contains(key) || values.getSurname().contains(key)) {
                result.add(values);
            }
        }
        return result;
    }
}
