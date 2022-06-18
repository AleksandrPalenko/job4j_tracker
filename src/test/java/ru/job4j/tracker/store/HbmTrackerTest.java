package ru.job4j.tracker.store;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class HbmTrackerTest {

    private HbmTracker tracker;

    @Before
    public void setUp() {
        tracker = new HbmTracker();
    }

    @After
    public void shutdown() throws Exception {
        tracker.close();
    }

    @Test
    public void whenReplaceItem() {
        HbmTracker hm = new HbmTracker();
        Item item = hm.add(Item.of("java1", "junior"));
        Item item1 = hm.add(Item.of("javaDev1", "junior1"));
        assertTrue(hm.replace(item.getId(), item1));
    }

    @Test
    public void whenAddItem() {
        HbmTracker hm = new HbmTracker();
        hm.add(Item.of("java1", "junior"));
        assertThat(hm.findAll().size(), is(1));
    }

    @Test
    public void whenFindById() {
    HbmTracker hm = new HbmTracker();
        Item item = hm.add(Item.of("java10", "junior"));
        assertThat(hm.findById(item.getId()), is(1));
    }

    @Test
    public void whenFindByName() {
        HbmTracker hm = new HbmTracker();
        hm.add(Item.of("java", "junior"));
        hm.add(Item.of("javaDev", "junior"));
        List<Item> list = hm.findByName("javaDev");
        assertThat(list.get(0).getName(), is("javaDev"));
    }

    @Test
    public void whenFindAllItems() {
        HbmTracker hm = new HbmTracker();
        hm.add(Item.of("item", "description"));
        assertThat(hm.findAll().size(), is(1));
    }

    @Test
    public void whenDeleteItem() {
        HbmTracker hm = new HbmTracker();
        Item item = hm.add(Item.of("item", "description"));
        assertTrue(hm.delete(item.getId()));
        assertTrue(hm.findAll().isEmpty());
    }
}