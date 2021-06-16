package ru.job4j.oop;

public class Surgeon extends Doctor {

    private int durationOfOperation;
    private String nameOfOperation;

    public Surgeon() {
        super();
    }

    public Surgeon(String name, String surname, String education, int birthday,
                   int experienceOfWork, String gender, int durationOfOperation,
                   String nameOfOperation) {
        super(name, surname, education, birthday, experienceOfWork, gender);
        this.durationOfOperation = durationOfOperation;
        this.nameOfOperation = nameOfOperation;
    }

    public int getDurationOfOperation() {
        return durationOfOperation;
    }

    public String getNameOfOperation() {
        return nameOfOperation;
    }

    public void operateToPeople(String assignedOperation) {
        System.out.println("Операция операция у данного поциента " + assignedOperation);
    }
}
