package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setFullName("Ivan Ivanov");
        student1.setGroup("11b");
        student1.setDateOfAdmission(new Date());
        System.out.println("ФИО студента: " + student1.getFullName() + ", Группа : " + student1.getGroup() + ", Дата поступления: " + student1.getDateOfAdmission());
    }
}
