package ru.job4j.tracker;

public class CreateAction implements UserAction {
    private final Output out;

    public CreateAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Create";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        System.out.println(name());
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }

    public static void main(String[] args) {

    }
}