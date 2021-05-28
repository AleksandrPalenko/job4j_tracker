package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }


    @Test
    public void whenFindNothing() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("null", "null", "null", "null")
        );
        ArrayList<Person> persons = phones.find("null");
        assertThat(persons.get(0).getSurname(), is("null"));
    }

}