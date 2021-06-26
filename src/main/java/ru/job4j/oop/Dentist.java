package ru.job4j.oop;

public class Dentist extends Doctor {

    private String nameOfTeeth;
    private int durationOfOperation;

    public Dentist() {
        super();
    }

    public Dentist(String name, String education,
                   int birthday, int experienceOfWork, String gender,
                   String nameOfTeeth, int durationOfOperation) {
        super(name, education, birthday, experienceOfWork, gender);
        this.nameOfTeeth = nameOfTeeth;
        this.durationOfOperation = durationOfOperation;
    }

    public String getNameOfTeeth() {
        return nameOfTeeth;
    }

    public int getDurationOfOperation() {
        return durationOfOperation;
    }

    public void healATooth(int countOfTeeth) {
        System.out.println("кол-во вылеченных зубов: " + countOfTeeth);
    }

    public static void main(String[] args) {

    }
}
