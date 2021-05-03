package ru.job4j.oop;

public class JSONReport extends TextReport {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String text = report.generate("name: name", "body: body");
        System.out.println(text);
    }
}
