package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collectToAddress() {
        List<Profile> values = List.of(
                new Profile(new Address("Moskva", "first", 1, 2)),
                new Profile(new Address("Pokrov", "second", 10, 21))
        );
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(values);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Moskva", "first", 1, 2));
        expected.add(new Address("Pokrov", "second", 10, 21));
        assertThat(rsl, is(expected));
    }

    @Test
    public void collectToAddressUnique() {
        List<Profile> values2 = List.of(
                new Profile(new Address("Moskva", "first", 1, 2)),
                new Profile(new Address("Bokrov", "second", 10, 21)),
                new Profile(new Address("Bokrov", "second", 10, 21))
        );
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(values2);
        List<Address> expected = new ArrayList<>();
        expected.add(new Address("Bokrov", "second", 10, 21));
        expected.add(new Address("Moskva", "first", 1, 2));
        assertThat(rsl, is(expected));
    }
}
