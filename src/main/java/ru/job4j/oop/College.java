package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman(); /* Объект класса Freshman*/
        Student student = freshman; /*приведение к типу родителя Student, up casting*/
        Object object = freshman; /*приведение к типу родителя Object, up casting*/
        Object oFresh = new Freshman(); /*Приведение типа при создании объекта*/
        Freshman freshFromObject = (Freshman) oFresh; /* приведение типа засчет понижения*/

    }
}
