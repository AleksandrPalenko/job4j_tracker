package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByItemIncreaseTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item(1, "Apple"),
                new Item(2, "Huaway"),
                new Item(4, "Sumsung")
        );
        List<Item> expect = Arrays.asList(
                new Item(1, "Apple"),
                new Item(2, "Huaway"),
                new Item(4, "Sumsung")
        );
        assertThat(items, is(expect));
    }
}
