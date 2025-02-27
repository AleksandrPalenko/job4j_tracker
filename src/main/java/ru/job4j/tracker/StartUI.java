package ru.job4j.tracker;

import ru.job4j.tracker.gcTracker.ProfAddAction;
import ru.job4j.tracker.gcTracker.ProfDeleteAction;
import ru.job4j.tracker.store.MemTracker;
import ru.job4j.tracker.store.Store;

import java.util.Arrays;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Store tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println("Wrong input, you can select: 0 .. " + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        UserAction[] actions = {
                new CreateAction(output),
                new DeleteAction(output),
                new ReplaceAction(output),
                new ShowAllAction(output),
                new FindNameAction(output),
                new FindItemAction(output),
                new ExitAction(output),
                new ProfAddAction(output),
                new ProfDeleteAction(output)
        };
        MemTracker tracker = new MemTracker();
        /*
        SqlTracker tracker = new SqlTracker();
        tracker.init();
         */
        new StartUI(output).init(input, tracker, Arrays.asList(actions));
    }

}

