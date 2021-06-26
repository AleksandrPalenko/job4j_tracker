package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void area() {
        Point a = new Point(0, 1, 1);
        Point b = new Point(4, 4, 2);
        Point c = new Point(0, 4, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        Assert.assertThat(rsl, closeTo(6, 0.001));
    }
}