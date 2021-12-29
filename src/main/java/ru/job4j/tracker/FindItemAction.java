package ru.job4j.tracker;

import ru.job4j.tracker.model.Item;

public class FindItemAction implements UserAction {
    private final Output out;

    public FindItemAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
                out.println(item);
        } else {
                out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}

