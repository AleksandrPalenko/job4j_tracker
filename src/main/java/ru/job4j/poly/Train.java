package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("The " + getClass().getSimpleName() + " on the rails");
    }

    @Override
    public void transferOfPassengers() {
        System.out.println("The " + getClass().getSimpleName()
                + " transfer passengers on the rails");
    }
}
