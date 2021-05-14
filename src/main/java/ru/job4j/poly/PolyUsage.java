package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle busForPassengers = new BusForPassengers();
        Vehicle plane = new Plane();
        Vehicle train = new Train();

        Vehicle[] vehicle = new Vehicle[] {busForPassengers, plane, train};
            for (Vehicle vehicle1: vehicle) {
                vehicle1.move();
                vehicle1.transferOfPassengers();

        }

    }
}
