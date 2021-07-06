package ru.job4j.lambda;

import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        Attachment[] atts1 = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + right.length() + " : " + left.length());
            return right.length() - left.length();
        };
    }
}
