package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;

public class StubInput implements Input {
    private List<String> answer;

    private int position = 0;

    public StubInput(String[] answer) {
        this.answer = Arrays.asList(answer);
    }

    @Override
    public String askStr(String question) {
        return answer.get(position++);
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}