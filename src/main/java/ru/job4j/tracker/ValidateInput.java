package ru.job4j.tracker;

import java.util.Collections;
import java.util.List;

public class ValidateInput implements Input {

    private final Output out;
    private final Input in;

    public ValidateInput(Output out, Input input) {
        this.out = out;
        this.in = input;
    }

    @Override
    public List<String> askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public List<Integer> askInt(String question) {
        boolean invalid = true;
        List<Integer> value = Collections.singletonList(-1);
        do {
            try {
                value = in.askInt(question);
                invalid = false;
            } catch (NumberFormatException nfe) {
                out.println("Please enter validate data again.");
            }
        } while (invalid);
        return value;
    }
}


