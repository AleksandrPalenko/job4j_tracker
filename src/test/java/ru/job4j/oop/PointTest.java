package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance3d() {
        double expected = 4;
        Point a = new Point(0, 3, 3);
        Point b = new Point(0, 7, 4);
        double rsl = a.distance3d(b);
        Assert.assertThat(rsl, closeTo(expected, 0.01));

    }

}