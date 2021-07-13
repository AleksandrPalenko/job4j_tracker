package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collectToAddress() {
        List<Address> values = new ArrayList<>();
        values.add(new Address("moskva", "first", 1, 2));
        values.add(new Address("moskva", "second", 4, 2));
        values.add(new Address("moskva", "third", 10, 2));
        values.add(new Address("moskva", "four", 8, 2));
        Profiles pr = new Profiles();
        List<Profiles> rsl = pr.collect(values);
    }
}