package ru.job4j.oop;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport json = new JSONReport();
        String text = json.generate("name", "body");
        System.out.println(text);
    }

}
