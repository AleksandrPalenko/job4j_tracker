package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(9);
        elements.add(12);
        elements.add(-2);
        elements.add(5);
        elements.add(-6);

        List<Integer> ourElements = elements.stream()
                .filter(el -> el > 0)
                .collect(Collectors.toList());
        ourElements.forEach(System.out::println);
    }

}
