package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance3d() {
        double expected = 3;
        Point a = new Point(3, 4, 2);
        Point b = new Point(1, 1, 1);
        double rsl = a.distance3d(b);
        Assert.assertThat(rsl,closeTo(expected,0.01));

    }

}