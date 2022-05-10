package ru.job4j.tracker;

import org.testng.annotations.Test;
import ru.job4j.tracker.store.MemTracker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FindNameActionTest {

    @Test
    public void executeFindActionByName() {
        Output out = new StubOutput();
        MemTracker tracker = new MemTracker();
        tracker.add(new Item(" item "));
        String findName = " item ";
        FindNameAction rep = new FindNameAction(out);
        Input input = mock(Input.class);
        when(input.askInt(any(String.class))).thenReturn(0);
        when(input.askStr(any(String.class))).thenReturn(findName);
        rep.execute(input, tracker);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is("=== Find item by Name ==="
                + ln  + findName
                + ln));
    }
}