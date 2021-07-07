package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> person = new ArrayList<>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = (values) -> values.getName().contains(key)
                || values.getPhone().contains(key)
                || values.getAddress().contains(key) || values.getSurname().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person persons : person) {
            if (combine.test(persons)) {
                result.add(persons);
            }
        }
        return result;
    }
}
