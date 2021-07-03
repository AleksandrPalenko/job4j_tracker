package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biCon = (s, s1) -> map.put(s, s1);
        biCon.accept(1, "one");
        biCon.accept(2, "two");
        biCon.accept(3, "three");
        biCon.accept(4, "four");
        biCon.accept(5, "five");
        biCon.accept(6, "six");
        biCon.accept(7, "seven");

        BiPredicate<Integer, String> biPred = (l, l2) -> l == 0 || l2.length() == 4;
        for (Integer i : map.keySet()) {
            if (biPred) {
                System.out.println("key: " + i + " value: " + map.get(i));
            }
        }
        Supplier<List<String>> sup = () -> new ArrayList<>(map.values());
        List<String> strings = new ArrayList<>(map.values());

        Consumer<String> con = (q) -> System.out.println(q);
        Function<String, String> func = s -> s.toUpperCase();
        for (String s : strings) {
            System.out.println(s.toUpperCase());
        }
    }
}