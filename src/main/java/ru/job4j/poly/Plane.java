package ru.job4j.poly;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("The " + getClass().getSimpleName() + " is flies through the air");
    }

    @Override
    public void transferOfPassengers() {
        System.out.println("The " + getClass().getSimpleName() + " transfer passengers through the air");
    }
}
