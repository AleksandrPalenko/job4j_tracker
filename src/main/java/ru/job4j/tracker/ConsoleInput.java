package ru.job4j.tracker;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public List<String> askStr(String question) {
        System.out.print(question);
        return Collections.singletonList(scanner.nextLine());
    }

    @Override
    public List<Integer> askInt(String question) {

        return Collections.singletonList(Integer.parseInt(String.valueOf(askStr(question))));
    }
}
