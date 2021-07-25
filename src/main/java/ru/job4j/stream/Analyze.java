package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(el -> el.getSubjects()
                        .stream())
                .mapToDouble(Subject::getScore)
                .average()
                .orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(x -> new Tuple(x.getName(), x.getSubjects()
                        .stream()
                        .mapToDouble(Subject::getScore)
                        .average()
                        .orElse(0D)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(x -> x.getSubjects().stream())
                .collect(Collectors
                        .groupingBy(Subject::getName, Collectors
                                .averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), x.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(x -> new Tuple(x.getName(), x.getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore)
                        .sum()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(x -> x.getSubjects().stream())
                .collect(Collectors
                        .groupingBy(Subject::getName, Collectors
                                .summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(x -> new Tuple(x.getKey(), x.getValue()))
                .max(Comparator.comparing(Tuple::getScore))
                .orElse(null);
    }

    public static void main(String[] args) {
        List<Tuple> average = Analyze.averageScoreByPupil(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100), new Subject("Lang", 100))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60), new Subject("Lang", 60)))
                ).stream()
        );
        System.out.println(average);
    }
}