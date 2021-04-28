package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));

    }

    public static void main(String[] args) {
        Point a = new Point(0, 2);
        Point b = new Point(0, 5);
        System.out.println("The first point: " + a.x + " and " + b.x + " The second point: " + b.x + " and " + b.y);
        double dins = a.distance(b);
        System.out.println(dins);
    }
}
