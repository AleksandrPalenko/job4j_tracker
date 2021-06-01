package ru.job4j.tracker;

import java.util.List;

public interface Input {

    List<String> askStr(String question);

    List<Integer> askInt(String question);
}
