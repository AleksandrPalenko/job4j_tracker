package ru.job4j.tracker;

import org.testng.annotations.Test;
import ru.job4j.tracker.store.MemTracker;

import static org.junit.Assert.*;

import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindItemActionTest {

    @Test
    public void executeFindByAction() {
        Output out = new StubOutput();
        MemTracker tracker = new MemTracker();
        tracker.add(new Item("Find item by "));
        FindItemAction rep = new FindItemAction(out);
        Input input = mock(Input.class);
        when(input.askInt(any(String.class))).thenReturn(1);
        rep.execute(input, tracker);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("=== Find item by Id ==="
                + ln + " item "
                + ln));
    }

}