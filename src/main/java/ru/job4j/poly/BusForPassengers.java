package ru.job4j.poly;

public class BusForPassengers implements Vehicle {
    @Override
    public void move() {
        System.out.println("The " + getClass().getSimpleName() + " moves on highways");

    }

    @Override
    public void transferOfPassengers() {
        System.out.println("The " + getClass().getSimpleName()
                + " transfer passengers on the road. ");

    }
}
