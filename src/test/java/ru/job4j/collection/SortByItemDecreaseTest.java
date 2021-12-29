package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.model.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByItemDecreaseTest {
    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item(1, "Lada"),
                new Item(2, "Bently"),
                new Item(4, "Audi")
        );
        List<Item> expect = List.of(
                new Item(4, "Audi"),
                new Item(2, "Bently"),
                new Item(1, "Lada")
        );
        items.sort(new SortByItemDecrease());
        assertThat(items, is(expect));

    }

}