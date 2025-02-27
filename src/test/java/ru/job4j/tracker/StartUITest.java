package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.tracker.store.MemTracker;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        MemTracker memTracker = new MemTracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, memTracker, Arrays.asList(actions));
        assertThat(memTracker.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output out = new StubOutput();
        MemTracker memTracker = new MemTracker();
        Item item = memTracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, memTracker, Arrays.asList(actions));
        assertThat(memTracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output out = new StubOutput();
        MemTracker memTracker = new MemTracker();
        Item item = memTracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, memTracker, Arrays.asList(actions));
        assertThat(memTracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        MemTracker memTracker = new MemTracker();
        Item item = memTracker.add(new Item("car"));
        Input in = new StubInput(
                new String[]{"0", "car", "1"}
        );
        String input = System.lineSeparator();
        UserAction[] actions = {
                new FindNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, memTracker, Arrays.asList(actions));
        assertThat(out.toString(), is(
                "Menu." + input
                        + "0. Find item by Name" + input
                        + "1. Exit program" + input
                        + "=== Find item by Name ===" + input
                        + " item " + input
                        + "Menu." + input
                        + "0. Find item by Name" + input
                        + "1. Exit program" + input
        ));
    }

    @Test
    public void whenFindAllAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        MemTracker memTracker = new MemTracker();
        Item item = memTracker.add(new Item("car"));
        String input = System.lineSeparator();
        UserAction[] actions = {
                new ShowAllAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, memTracker, Arrays.asList(actions));
        assertThat(out.toString(), is(
                "Menu." + input
                        + "0. Show all Items" + input
                        + "1. Exit program" + input
                        + "=== Show all items ====" + input
                        + item + input
                        + "Menu." + input
                        + "0. Show all Items" + input
                        + "1. Exit program" + input
        ));
    }
    
    @Test
    public void whenFindByIdAction() {
        Output out = new StubOutput();
        MemTracker memTracker = new MemTracker();
        Item item = memTracker.add(new Item(2, "job4j"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        String input = System.lineSeparator();
        UserAction[] actions = {
                new FindItemAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, memTracker, Arrays.asList(actions));
        assertThat(out.toString(), is(
                "Menu." + input
                        + "0. Find item by Id" + input
                        + "1. Exit program" + input
                        + "=== Find item by Id ===" + input
                        + " item " + input
                        + "Menu." + input
                        + "0. Find item by Id" + input
                        + "1. Exit program" + input
        ));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"15", "0"}
        );
        MemTracker memTracker = new MemTracker();
        UserAction[] actions = new UserAction[]{
                new ExitAction(out)
        };
        new StartUI(out).init(in, memTracker, Arrays.asList(actions));
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Exit program" + ln
                        + "Wrong input, you can select: 0 .. 0" + ln
                        + "Menu." + ln
                        + "0. Exit program" + ln
                )
        );
    }
}