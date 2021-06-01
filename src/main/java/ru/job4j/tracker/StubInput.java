package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StubInput implements Input {
    private List<List<String>> answer;
    private int position = 0;

    public StubInput(List<String> answer) {
        this.answer = Arrays.asList(answer);
        ////this.answer = answer;
    }

    @Override
    public List<String> askStr(String question) {
        return answer.get(position++);
        //return answer[position++];
    }

    @Override
    public List<Integer> askInt(String question) {
        return Collections.singletonList(Integer.parseInt(String.valueOf(askStr(question))));
    }
}
