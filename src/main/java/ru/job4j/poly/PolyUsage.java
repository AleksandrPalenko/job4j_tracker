package ru.job4j.poly;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle busForPassengers = new BusForPassengers();
        Vehicle plane = new Plane();
        Vehicle train = new Train();

        Vehicle[] vehicle = new Vehicle[] {busForPassengers, plane, train};
            for (Vehicle vehicles: vehicle) {
                vehicles.move();
                vehicles.transferOfPassengers();

        }

    }
}
