package ru.job4j.lambda;

import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] elements = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = Comparator.comparingInt(Attachment::getSize);
        Comparator<String> cmpSize = Comparator.comparingInt(String::length);
        Comparator<String> cmpText = String::compareTo;
        Comparator<String> cmpDescSize = (left, right) -> {
            return Integer.compare(right.length(), left.length());
        };
    }
}