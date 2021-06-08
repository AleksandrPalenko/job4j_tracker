package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByItemDecreaseTest {
    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item(4, "Audi"),
                new Item(2, "Bently"),
                new Item(1, "Lada")
        );
        List<Item> expect = Arrays.asList(
                new Item(4, "Audi"),
                new Item(2, "Bently"),
                new Item(1, "Lada")
        );
        assertThat(items, is(expect));
    }

}