package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String voice = "Неизвестное слово " + eng;
        return voice;
    }

    public static void main(String[] args) {
        DummyDic alex = new DummyDic();
        String talk = alex.engToRus("talk");
        System.out.println(talk);
    }
}
