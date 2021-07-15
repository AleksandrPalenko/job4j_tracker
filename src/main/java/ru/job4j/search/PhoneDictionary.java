package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> person = new ArrayList<>();

    public void add(Person person) {
        this.person.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> predName = (values) -> values.getName().contains(key);
        Predicate<Person> predPhone = (values) -> values.getPhone().contains(key);
        Predicate<Person> predAddress = (values) -> values.getAddress().contains(key);
        Predicate<Person> predSurname = (values) -> values.getSurname().contains(key);
        var combine = predName.or(predPhone).or(predAddress).or(predSurname);
        ArrayList<Person> result = new ArrayList<>();
        for (var persons : person) {
            if (combine.test(persons)) {
                result.add(persons);
            }
        }
        return result;
    }
}
