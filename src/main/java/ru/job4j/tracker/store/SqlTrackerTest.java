package ru.job4j.tracker.store;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.SqlTracker;
import ru.job4j.tracker.Item;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SqlTrackerTest {

    static Connection connection;
    SqlTracker tracker = new SqlTracker(connection);

    @BeforeClass
    public static void initConnection() {
        try (InputStream in = SqlTrackerTest.class.getClassLoader()
                .getResourceAsStream("test.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @AfterClass
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    @After
    public void wipeTable() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("delete from items")) {
            statement.execute();
        }
    }

    @Test
    public void whenSaveItemAndFindByGeneratedIdThenMustBeTheSame() {
        Item item = new Item("item");
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }

    @Test
    public void whenSaveItemAndFindGeneratedIdAndReplaceHim() {
        Item item = new Item("item");
        tracker.add(item);
        int id = item.getId();
        Item anotherItem = new Item("new_item");
        tracker.replace(id, anotherItem);
        assertThat(tracker.findById(id).getName(), is("new_item"));
    }

    @Test
    public void whenSaveItemAndFindGeneratedIdAndDeleteHim() {
        Item item = new Item("item");
        tracker.add(item);
        int id = item.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }

    @Test
    public void whenSaveItemAndFindGeneratedIdAndFindAll() {
        Item item = new Item();
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        assertEquals(tracker.findAll(), is(List.of(item, item1, item2, item3)));
    }

    @Test
    public void whenGetItemByName() {
        Item item = new Item("item");
        Item item2 = new Item("item2");
        tracker.add(item);
        tracker.add(item2);
        assertThat(tracker.findByName("item"), is(List.of(item, item2)));
    }

    @Test
    public void whenGetItemById() {
        Item item = new Item("item");
        tracker.add(item);
        assertEquals(item, tracker.findById(item.getId()));
    }
}