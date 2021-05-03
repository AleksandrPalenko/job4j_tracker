package ru.job4j.oop;

public class Doctor extends Profession {

    private int experienceOfWork;
    private String gender;

    public Doctor() {
        super();
    }

    public Doctor(String name, String surname, String education, int birthday, int experienceOfWork, String gender) {
        super(name, surname, education, birthday);
        this.experienceOfWork = experienceOfWork;
        this.gender = gender;
    }

    public int getExperienceOfWork() {
        return experienceOfWork;
    }

    public String getGender() {
        return gender;
    }


    public void helpToPatient() {
        System.out.println("Пол пациента " + gender);
    }

    public void giveADiagnosis(String nameOfDiagnosis) {
        System.out.println("Название диагноза " + nameOfDiagnosis);
    }

    public static void main(String[] args) {

    }
}