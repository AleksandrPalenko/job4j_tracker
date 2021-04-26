package ru.job4j.oop;

public class Error {

    private boolean condition;

    private int errorStatus;

    private String errorMassage;


    public Error(boolean condition, int errorStatus, String errorMassage) {
        this.condition = condition;
        this.errorStatus = errorStatus;
        this.errorMassage = errorMassage;
    }

    public void printInfo() {
        System.out.println("Есть ли ошибка: " + condition);
        System.out.println("Статус ошибки: " + errorStatus);
        System.out.println("Текст ошибки: " + errorMassage);
    }

    public Error() {

    }

    public static void main(String[] args) {
        Error error = new Error(true, 404, "This page is not found");
        error.printInfo();
    }
}
