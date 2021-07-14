package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public static void main(String[] args) {
        Integer[][] matrixx = new Integer[][]{
                {1, 2}, {3, 4}
        };
        List<Integer> matrix = Stream.of(matrixx)
        .flatMap(Stream::of).collect(Collectors.toList());
        matrix.forEach(System.out::println);

    }

    public static List<Integer> convertToMatrix(Integer[][] matrix) {
        return Arrays.stream(matrix)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}
