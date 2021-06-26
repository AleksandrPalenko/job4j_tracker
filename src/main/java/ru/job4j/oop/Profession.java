package ru.job4j.oop;

public class Profession {

    private String name;
    private String education;
    private int birthday;

    public Profession() {

    }

    public Profession(String name, String education, int birthday) {
        this.name = name;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }
}