package ru.job4j.tracker;

import ru.job4j.tracker.store.Store;

public class ExitAction implements UserAction {
    private final Output out;

    public ExitAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Exit program";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        return false;
    }
}

